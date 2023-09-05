package ch08interface.book.exam12;

import java.rmi.Remote;

public class Audio implements RemoteControl{
    //필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume> RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨: " + this.volume);
    }

    //추가 필드 선언
    private int memoryVolume;

    //디폴트 메소드도 재정의해서 쓸 수 있음

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }
        else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);  //mute가 false일경우, 원래 볼륨으로 복원하는 코드
        }
    }
}
