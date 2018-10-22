/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
/**
 * @author win8
 */
public class Midlet extends MIDlet {
    private Display display;
    private Form frm1;
    private Form frm2;
    private Form frm3;
    private Form frm4;
    private Form frm5;
    private Form frm6;
    private Form frm7;
    private Form frm8;
    private Form frm9;
    private Form frm10;
    private Form frm11;
    private Form frm12;
    private Command next;
    private Command go;
    private Command gonext;
    private Command go1;
    private Command go2;
    private Command go3;
    private Command go4;
    private Command go5;
    private Command go6;
    private Command go7;
    private Command go8;
    private Image img;
    private Image img1;
    //private Alert msgalert;
    //private StringItem lbl;
    //private TextField txt1=new TextField("Ra--i-","Ra--i-",3,TextField.ANY);
    private TextField ltr1=new TextField("Clue:Animal","",6,TextField.ANY);
    private TextField ltr2=new TextField("clue:Hardware of computer","",5,TextField.ANY);
    private TextField ltr3=new TextField("clue:Hide","",4,TextField.ANY);
    private TextField ltr4=new TextField("clue:Cloth","",7,TextField.ANY);
    private TextField ltr5=new TextField("clue:Care","",4,TextField.ANY);
    private TextField ltr6=new TextField("clue:Cinima","",9,TextField.ANY); 
    private TextField ltr7=new TextField("clue:Fruit","",12,TextField.ANY);
    private TextField ltr8=new TextField("clue:Day","",8,TextField.ANY);
    private TextField ltr9=new TextField("clue:insect","",8,TextField.ANY);
    private TextField ltr10=new TextField("clue:Action","",5,TextField.ANY);
    public void ltr1valid(String a)
    {
        if(a.equals("Rabbit")||a.equals("RABBIT")||a.equals("rabbit"))
            display.setCurrent(frm3);
        else
            tryagain();
    }
    public void ltr2valid(String b)
    {
        if(b.equals("Mouse")||b.equals("MOUSE")||b.equals("mouse"))
            display.setCurrent(frm4);
        else
            tryagain1();
    }
    public void ltr3valid(String c)
    {
        if(c.equals("Seek")||c.equals("SEEK")||c.equals("seek"))
            display.setCurrent(frm5);
        else
            tryagain2();
    }
    public void ltr4valid(String c)
    {
        if(c.equals("Pyjamas")||c.equals("PYJAMAS")||c.equals("pyjamas"))
            display.setCurrent(frm6);
        else
            tryagain3();
    }
    public void ltr5valid(String c)
    {
        if(c.equals("Love")||c.equals("LOVE")||c.equals("love"))
            display.setCurrent(frm7);
        else
            tryagain4();
    }
    public void ltr6valid(String c)
    {
        if(c.equals("Hollywood")||c.equals("HOLLYWOOD")||c.equals("hollywood")||c.equals("HollyWood"))
            display.setCurrent(frm8);
        else
            tryagain5();
    }
    public void ltr7valid(String c)
    {
        if(c.equals("CustardApple")||c.equals("Custardapple")||c.equals("custardapple")||c.equals("CUSTARDAPPLE"))
            display.setCurrent(frm9);
        else
            tryagain6();
    }
    public void ltr8valid(String c)
    {
        if(c.equals("November")||c.equals("november")||c.equals("NOVEMBER"))
            display.setCurrent(frm10);
        else
            tryagain7();
    }
   public void ltr9valid(String c)
    {
        if(c.equals("HoneyBee")||c.equals("Honeybee")||c.equals("honeybee")||c.equals("HONEYBEE"))
            display.setCurrent(frm11);
        else
            tryagain8();
    }
    public void ltr10valid(String c)
    {
        if(c.equals("Final")||c.equals("FINAL")||c.equals("final"))
            display.setCurrent(frm12);
        else
            tryagain9();
    }
    public void tryagain()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm2);
    }
    public void tryagain1()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm3);
    }
    public void tryagain2()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm4);
    }
    public void tryagain3()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm5);
    }
    public void tryagain4()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm6);
    }
    public void tryagain5()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm7);
    }
    public void tryagain6()
    {
      Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm8);
    }
    public void tryagain7()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm9);
    }
   public void tryagain8()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm10);
    }
    public void tryagain9()
    {
       Alert error=new Alert("please fill the letters Correctly","try again",null,AlertType.ERROR);
       error.setTimeout(Alert.FOREVER);
       display.setCurrent(error,frm11);
    }
    public void startApp() {
        try
        {
           img=Image.createImage("/index1.png");
           img1=Image.createImage("/images.gif");
        }
        catch(Exception error)
        {
            
        }
        if(display==null)
        {
            Canvas canva=new canvas1();
            display=Display.getDisplay(this);
            frm1=new Form("GUESS!!!!!");
            next=new Command("Next",Command.SCREEN,0);
            frm1.addCommand(next);
            frm1.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==next)
                    {
                        display.setCurrent(frm2);
                        
                    }
                }
            });
            frm12=new Form("******WIN*******");
            frm12.append(img1);
            
            frm11=new Form("-ina-");
            go8=new Command("go",Command.BACK,0);
            frm11.addCommand(go8);
            frm11.append(ltr10);
            frm11.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go8)
                    {
                        String msg;
                        msg=ltr10.getString();
                        ltr10valid(msg);
                    }
                }
            });
            
            frm10=new Form("-o--y--e");
            go7=new Command("go",Command.BACK,0);
            frm10.addCommand(go7);
            frm10.append(ltr9);
            frm10.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go7)
                    {
                        String msg;
                        msg=ltr9.getString();
                        ltr9valid(msg);
                    }
                }
            });
            frm9=new Form("---e-be-");
            go6=new Command("go",Command.BACK,0);
            frm9.addCommand(go6);
            frm9.append(ltr8);
            frm9.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go6)
                    {
                        String msg;
                        msg=ltr8.getString();
                        ltr8valid(msg);
                    }
                }
            });
            frm8=new Form("C--t---Ap--e");
            go5=new Command("go",Command.BACK,0);
            frm8.addCommand(go5);
            frm8.append(ltr7);
            frm8.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go5)
                    {
                        String msg;
                        msg=ltr7.getString();
                        ltr7valid(msg);
                    }
                }
            });
            frm7=new Form("H-l--w---");
            go4=new Command("go",Command.BACK,0);
            frm7.addCommand(go4);
            frm7.append(ltr6);
            frm7.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go4)
                    {
                        String msg;
                        msg=ltr6.getString();
                        ltr6valid(msg);
                    }
                }
            });
            frm6=new Form("--v-");
            go3=new Command("go",Command.BACK,0);
            frm6.addCommand(go3);
            frm6.append(ltr5);
            frm6.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go3)
                    {
                        String msg;
                        msg=ltr5.getString();
                        ltr5valid(msg);
                    }
                }
            });
            frm5=new Form("py--m--");
            go2=new Command("go",Command.BACK,0);
            frm5.addCommand(go2);
            frm5.append(ltr4);
            frm5.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go2)
                    {
                        String msg;
                        msg=ltr4.getString();
                        ltr4valid(msg);
                    }
                }
            });
            frm4=new Form("S-e-");
            go1=new Command("go",Command.BACK,0);
            frm4.addCommand(go1);
            frm4.append(ltr3);
            frm4.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==go1)
                    {
                        String msg;
                        msg=ltr3.getString();
                        ltr3valid(msg);
                    }
                }
            });
            frm3=new Form("M---e");
            gonext=new Command("go",Command.BACK,0);
            frm3.addCommand(gonext);
            frm3.append(ltr2);
            frm3.setCommandListener(new CommandListener(){
                public void commandAction(Command c,Displayable d)
                {
                    if(c==gonext)
                    {
                        String msg;
                        msg=ltr2.getString();
                        ltr2valid(msg);
                    }
                }
            });
           frm2=new Form("Ra--i-");
           go=new Command("go",Command.BACK,0);
           frm2.addCommand(go);
           frm2.append(ltr1);
           //frm2.append(password);
           //cancel=new Command("Cancel",Command.CANCEL,0);
          //frm2.addCommand(cancel);
          // login=new Command("Login",Command.OK,0);
          // frm2.addCommand(login);
           frm2.setCommandListener(new CommandListener()
           {
               public void commandAction(Command c,Displayable d)
               {
                 if(c==go)
                 {
                     String message;
                     //message="Jolly" + ltr1.getString()+"Completed.";
                     //msgalert.setString(message);
                     //display.setCurrent(msgalert,frm3);
                     message=ltr1.getString();
                     ltr1valid(message);
                 }
               }
           });
        }
        
        frm1.append(img);
        display.setCurrent(frm1);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    class canvas1 extends Canvas{
        public void paint(Graphics g)
        {
            g.setColor(0xFFFF00);
        }
    }
}
