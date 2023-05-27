package tv;
public class TV {
    int channel;
    int volume;
    boolean on;
    TV(){channel=1;volume=1;on=false;}
    void  turnon()
    {
        on=true;
    }
    void turnoff()
    {
        on=false;
    }
    void setchannel(int newch)
    {
        if(on &&newch>=1&&newch<=255)
        {
            channel=newch;
        }
    }
    void setvolume(int vol)
    {
        if(on &&vol>=1&&vol<=10)
            volume=vol;
    }
    void nextchannel()
    {
        if(on&&channel<255)
            channel++;
    }
    void perviouschannel()
    {
        if(on&&channel>1)
            channel--;
    }
    void volup()
    {
       if(on&&volume<10)
           volume++;
    }
    void voldown()
    {
        if(on&&volume>1)
            volume--;
        
    }
    public static void main(String[] args) {
        TV t=new TV() ;
        t.turnon();
        t.setchannel(122);
        t.setvolume(10);
        t.turnoff();
        t.voldown();
        t.voldown();
        t.nextchannel();
        t.nextchannel();
        t.perviouschannel();
        System.out.println("The Current Channel is:"+t.channel+"  The Volume Is"+t.volume);
        
    }
    
}
