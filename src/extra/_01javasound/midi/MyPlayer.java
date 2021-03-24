package extra._01javasound.midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * 标题: 模拟一个音乐播放程序demo - JavaSound的MIDI类
 *
 * @Author: Jiang
 * @Date: 2021/3/23 13:18
 */
public class MyPlayer {

    public static void main(String[] args) {
        Sequencer player; // 发声装置
            try {
                player = MidiSystem.getSequencer();
                player.open();
                //Sequence seq = new Sequence(timing, 4); //要演奏的乐曲CD
                //Track t = seq.createTrack(); //带有乐曲的信息记录
                //t.add(myMidiEvent); // myMidiEvent 乐曲中的音符等信息
                //player.setSequence(seq);

            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            }
        /*catch(InvalidMidiDataException e) {
            e.printStackTrace();
        }*/
        }
}
