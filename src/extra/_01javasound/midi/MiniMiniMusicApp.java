package extra._01javasound.midi;

import javax.sound.midi.*;

/**
 * 标题: 一个声音播放程序
 *
 * @Author: Jiang yuting
 * @Date: 2021/3/23 13:27
 */
public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        Sequencer player; // 发声装置
        try {
            /**取得Sequencer,并将其打开*/
            player = MidiSystem.getSequencer(); //getSequencer()会抛出MidiUnavailableException异常
            player.open();
            /**取得Sequence对象*/
            Sequence seq = new Sequence(Sequence.PPQ, 4); //要演奏的乐曲CD,new Sequence()会抛出InvalidMidiDataException异常
            /**取得Track对象*/
            Track track = seq.createTrack(); //带有乐曲的信息记录
            /**为Track对象增加MidiEvent*/
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a, 1);// MidiEvent 乐曲中的音符等信息
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b, 16);// MidiEvent 乐曲中的音符等信息
            track.add(noteOff);
            /**将Sequence送到Sequencer上*/
            player.setSequence(seq);
            /**开始播放*/
            player.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch(InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
