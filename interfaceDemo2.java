class Phone
{
    void voiceCall()
    {
        System.out.println("Make voice call");
    }
    void sms()
    {
        System.out.println("We can send SMS");
    }
}

interface Camera
{
    void click();
    void record();
}

interface Player
{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, Player
{

    @Override
    public void click() {
        System.out.println("Take a selfi");
    }

    @Override
    public void record() {
        System.out.println("Take a video");
    }

    @Override
    public void play() {
        System.out.println("Play Music");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
}

public class interfaceDemo2
{
    public static void main(String[] args)
    {
        SmartPhone s = new SmartPhone();
        s.voiceCall();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
    }
}
