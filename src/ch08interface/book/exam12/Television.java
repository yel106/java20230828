package ch08interface.book.exam12;

public class Television implements RemoteControl{

    //필드
    private int volume;

    //추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume> RemoteControl.MAX_VOLUME) {       //구현된거라서 앞에 RemoteControl안써도 됨   //인터페이스 상수 필드를 이용해서 volume필드의 값을 제한
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if( volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 " + this.volume);
    }

}
