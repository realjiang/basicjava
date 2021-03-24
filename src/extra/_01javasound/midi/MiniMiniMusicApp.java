package extra._01javasound.midi;

import javax.sound.midi.*;

/**
 * 标题: 一个声音播放程序
 *
 * @Author: Jiang
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
            ShortMessage a = new ShortMessage(); //Message描述做什么
            //第一个参数是信息类型(144指note on指令,128指note off指令),
            //其余三个参数用来描述所要发出的声响,分别是频道,音符,音道
            //频道:表示不同的演奏者/乐器. 如 1吉他 2Bass
            //音符:0~127 代表不同音高
            //音道:用多大的音道按下?0几乎听不到,100算是差不多
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a, 1);// MidiEvent 乐曲中的音符等信息,指定Message何时做
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
