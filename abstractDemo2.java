abstract class Mobile
{
    void voiceCall()
    {
        System.out.println("You can make voice Calls");
    }
    abstract void camera();
    abstract void touchDisplay();
}
class samsung extends Mobile
{

    @Override
    void camera()
    {
        System.out.println("16 Mega Pixel Camera");
    }

    @Override
    void touchDisplay()
    {
        System.out.println("5.5 inch Display");
    }
}
class nokia extends Mobile
{

    @Override
    void camera()
    {
        System.out.println("8 Mega Pixel Camera");
    }

    @Override
    void touchDisplay()
    {
        System.out.println("5 inch Display");
    }

    void fingerPrint()
    {
        System.out.println("Fast Finger Sensor..");
    }
}
public class abstractDemo2
{
    public static void main(String[] args)
    {
        samsung m32 = new samsung();
        m32.voiceCall();
        m32.touchDisplay();
        m32.camera();

        nokia n1 = new nokia();
        n1.voiceCall();
        n1.touchDisplay();
        n1.camera();
        n1.fingerPrint();
    }
}
