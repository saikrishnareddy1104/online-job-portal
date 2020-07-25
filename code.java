
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;




class Code extends JFrame  implements ActionListener
{
public void actionPerformed(ActionEvent event)
{String s=event.getActionCommand();


if(s.equals("signup"))
 {

Registration t=new Registration();

}

if(s.equals("login"))
 {

Login z=new Login();

}

if(s.equals("RecruitersLogin"))
 {

RecruitersLogin m=new RecruitersLogin();

}

}
public static void main(String args[]){
Code f=new Code();

f.setVisible(true);
f.setTitle("online job portal");
f.setSize(1100,1100);
f.setLayout(null);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel l =new JLabel("Welcome to Online Job portal!!!");
l.setBounds(300,100,1000,100);
l.setFont(new Font("Ariel", Font.BOLD ,30));
f.add(l);

Button btn1=new Button("login");

Button btn2=new Button("signup");
Button btn3=new Button("RecruitersLogin");

f.add(btn1);
f.add(btn2);
f.add(btn3);

Cursor cur=new Cursor(Cursor.HAND_CURSOR);

btn1.setBounds(150,300,120,80);
btn1.setCursor(cur);
btn1.setBackground(Color.YELLOW);
btn1.addActionListener(f);


btn2.setBounds(450,300,120,80);
btn2.setCursor(cur);
btn2.setBackground(Color.YELLOW);
btn2.addActionListener(f);

btn3.setBounds(750,300,120,80);
btn3.setCursor(cur);
btn3.setBackground(Color.YELLOW);
btn3.addActionListener(f);

}
}

class Registration 
{ 
Registration(){
JFrame frame = new JFrame("signup");
frame.setTitle("signup");
frame.setVisible(true);
frame.setSize(800,800);

frame.setLayout(null);


JLabel name=new JLabel("name");
name.setBounds(50,50,60,30);
JTextField name_tf = new JTextField();
name_tf.setBounds(150,50,100,30);
String g=name_tf.getText();

JLabel mobile=new JLabel("Email");
mobile.setBounds(50,100,60,30);
JTextField mobile_tf = new JTextField();
mobile_tf.setBounds(150,100,100,30);
String g1=mobile_tf.getText();


JLabel dob=new JLabel("DOB");
dob.setBounds(50,150,60,30);
String[] day_arr=new String[31];
for(int i=1;i<=31;i++)
   day_arr[i-1]=Integer.toString(i);
JComboBox day=new JComboBox(day_arr);
day.setBounds(150,150,50,25);

String[] month_arr= {"Jan" , "Feb" , "Mar" , "Apr" , "May" , "June" , "July" , "Aug" , "Sept" , "Oct" , "Nov" , "Dec"};
JComboBox month=new JComboBox(month_arr);
month.setBounds(220,150,70,25);

String[] year_arr=new String[70];
for(int i=1951;i<=2020;i++)
   year_arr[i-1951]=Integer.toString(i);
JComboBox year=new JComboBox(year_arr);
year.setBounds(310,150,60,25);



JLabel gender=new JLabel("gender");
gender.setBounds(50,200,60,30);
JRadioButton male=new JRadioButton("Male");
male.setBounds(150,200,80,30);
JRadioButton female=new JRadioButton("Female");
female.setBounds(230,200,90,30);

ButtonGroup gender_tf = new ButtonGroup();
gender_tf.add(male);
gender_tf.add(female);


JLabel address=new JLabel("Mobile");
address.setBounds(50,250,60,30);
JTextField address_tf = new JTextField();
address_tf.setBounds(150,250,100,30);
String g3=address_tf.getText();

JLabel uname=new JLabel("Username");
uname.setBounds(50,300,60,30);
JTextField uname_tf = new JTextField();
uname_tf.setBounds(150,300,100,30);
String g4=uname_tf.getText();

JLabel upass=new JLabel("password");
upass.setBounds(50,350,60,30);
JPasswordField upass_tf = new JPasswordField();
upass_tf.setBounds(150,350,100,30);
String g5=upass_tf.getText();

JCheckBox tand=new JCheckBox("I accept all terms and conditions");
tand.setBounds(50,400,250,25);

JButton submit=new JButton("submit");
submit.setBounds(100,500,80,40);
submit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
if(tand.isSelected()==true && (uname_tf.getText().trim().length()!= 0 ) && (mobile_tf.getText().trim().length()!= 0 ) && (address_tf.getText().trim().length()!= 0 ) && (upass_tf.getText().trim().length()!=0 ) && (name_tf.getText().trim().length()!=0 ))
{
frame.dispose();

}
else if(tand.isSelected()==false)
{

JFrame err =new JFrame();
err.setVisible(true);
err.setBounds(200,100,600,500);
err.setLayout(null);
JLabel ty=new JLabel("accept the terms and conditions");
ty.setBounds(80,30,200,50);

err.add(ty);

}

else if((tand.isSelected()==false) || (uname_tf.getText().trim().length()==0 ) || (mobile_tf.getText().trim().length()==0 ) || (address_tf.getText().trim().length()==0 )|| (upass_tf.getText().trim().length()==0 ) || (name_tf.getText().trim().length()==0 ))
{

JFrame w=new JFrame();
w.setVisible(true);
w.setBounds(200,100,600,500);
w.setLayout(null);
JLabel l1=new JLabel("All fields are mandatory");
l1.setBounds(80,30,200,100);
w.add(l1);

}
}});

frame.add(name);
frame.add(name_tf);
frame.add(mobile);
frame.add(mobile_tf);
frame.add(dob);
frame.add(day);
frame.add(month);
frame.add(year);
frame.add(gender);
frame.add(male);
frame.add(female);
frame.add(address);
frame.add(address_tf);
frame.add(tand);
frame.add(submit);
frame.add(uname);
frame.add(uname_tf);
frame.add(upass);
frame.add(upass_tf);
}

}





class Login extends JFrame
{
Login(){
JFrame t = new JFrame();
t.setTitle("login");
t.setVisible(true);
t.setBounds(200,100,600,500);
t.setLayout(null);
t.setLayout(null);
t.setBackground(Color.ORANGE);
JLabel name=new JLabel("username");
name.setBounds(50,50,60,30);
t.add(name);

JTextField name_tf = new JTextField();
name_tf.setBounds(150,50,100,30);
t.add(name_tf);

JLabel password=new JLabel("password");
password.setBounds(50,150,60,30);
t.add(password);


JPasswordField psw_tf=new JPasswordField();
psw_tf.setBounds(150,150,100,30);
t.add(psw_tf);

JButton subm=new JButton("submit");
subm.setBounds(100,355,80,40);
t.add(subm);
subm.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
String s1 = name_tf.getText();
String s2 = psw_tf.getText();

if(s1.equals("sai") && s2.equals("java")||s1.equals("harsha") && s2.equals("java")){
t.setVisible(false);
}

JFrame f=new JFrame();

if(s1.equals("sai") && s2.equals("java")){
f.setVisible(true);
f.setTitle("online job portal");
f.setSize(1100,1100);
f.setLayout(null);



Label q=new Label("applicants name   :  saikrishnareddy");
q.setBounds(100,200,900,100);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Label z=new Label("email id     :   saikrishnareddy.singi@gmail.com");
z.setBounds(100,300,900,100);
z.setFont(new Font("Ariel", Font.BOLD ,20));
Label w=new Label("dob    : 11-Apr-2000");
w.setBounds(100,400,900,100);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Label i=new Label("mobile no    :   9573134056");
i.setBounds(100,500,900,100);
i.setFont(new Font("Ariel", Font.BOLD ,20));
Label y=new Label("no of companys registered    :  4");
y.setBounds(100,600,900,100);
y.setFont(new Font("Ariel", Font.BOLD ,20));

f.add(q);
f.add(z);
f.add(w);
f.add(i);
f.add(y);



JButton btn1=new JButton("home");

JButton btn2=new JButton("companies");
JButton btn3=new JButton("jobs");

JButton btn4=new JButton("Logout");

btn4.setBounds(900,50,100,40);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
f.dispose();
}});
Label t=new Label("welcome to online job portal!!!");
t.setBounds(250,200,1000,300);
t.setFont(new Font("Ariel", Font.BOLD ,30));


f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);


Cursor cur=new Cursor(Cursor.HAND_CURSOR);

btn1.setBounds(100,50,100,40);
btn1.setCursor(cur);
btn1.setBackground(Color.YELLOW);
btn1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){




}});



btn2.setBounds(400,50,100,40);
btn2.setCursor(cur);
btn2.setBackground(Color.YELLOW);
btn2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

Company d =new Company();


}});


btn3.setBounds(700,50,100,40);
btn3.setCursor(cur);
btn3.setBackground(Color.YELLOW);
btn3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

Jobs p =new Jobs();

}});



f.add(btn1);
f.add(btn2);
f.add(btn3);


}

//second user

if(s1.equals("harsha") && s2.equals("java")){
f.setVisible(true);
f.setTitle("online job portal");
f.setSize(1100,1100);
f.setLayout(null);


Label q=new Label("applicants name   :  Harsha");
q.setBounds(100,200,900,100);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Label z=new Label("email id     :   ehvr@gmail.com");
z.setBounds(100,300,900,100);
z.setFont(new Font("Ariel", Font.BOLD ,20));
Label w=new Label("dob    : 9-june-1999");
w.setBounds(100,400,900,100);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Label i=new Label("mobile no    :   9490969764");
i.setBounds(100,500,900,100);
i.setFont(new Font("Ariel", Font.BOLD ,20));
Label y=new Label("no of companys registered    :  3");
y.setBounds(100,600,900,100);
y.setFont(new Font("Ariel", Font.BOLD ,20));


f.add(q);
f.add(z);
f.add(w);
f.add(i);
f.add(y);


JButton btn1=new JButton("home");

JButton btn2=new JButton("companies");
JButton btn3=new JButton("jobs");
JButton btn4=new JButton("Logout");

btn4.setBounds(900,50,100,40);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
f.dispose();
}});

Label t=new Label("welcome to online job portal!!!");
t.setBounds(250,200,1000,300);
t.setFont(new Font("Ariel", Font.BOLD ,30));


f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);


Cursor cur=new Cursor(Cursor.HAND_CURSOR);

btn1.setBounds(100,50,100,40);
btn1.setCursor(cur);
btn1.setBackground(Color.YELLOW);
btn1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){




}});



btn2.setBounds(400,50,100,40);
btn2.setCursor(cur);
btn2.setBackground(Color.YELLOW);
btn2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

Company d =new Company();


}});


btn3.setBounds(700,50,100,40);
btn3.setCursor(cur);
btn3.setBackground(Color.YELLOW);
btn3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

Jobs p =new Jobs();

}});



f.add(btn1);
f.add(btn2);
f.add(btn3);


}




}});

}
}




//companies list
class Company 
{
Company(){
JFrame t = new JFrame();
t.setTitle("companies list");
t.setVisible(true);
t.setSize(1000,1000);

t.setLayout(null);

JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
t.dispose();
}});
t.add(btn4);

Container cntr=t.getContentPane();
cntr.setLayout(null);


Label com1=new Label("1.TechMahindra");
com1.setBounds(50,50,200,60);
com1.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com1);

Label com2=new Label("2.Deloitte");
com2.setBounds(50,100,150,60);
com2.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com2);

Label com3=new Label("3.Microsoft");
com3.setBounds(50,150,150,60);
com3.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com3);

Label com4=new Label("4.Google");
com4.setBounds(50,200,150,60);
com4.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com4);

JLabel com5=new JLabel("5.Oracle");
com5.setBounds(50,250,150,60);
com5.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com5);

JLabel com6=new JLabel("6.Adobe");
com6.setBounds(50,300,150,60);
com6.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com6);

JLabel com7=new JLabel("7.Qualcomn");
com7.setBounds(50,350,150,60);
com7.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com7);

JLabel com8=new JLabel("8.Apple");
com8.setBounds(50,400,150,60);
com8.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com8);


JLabel com9=new JLabel("9.cisco");
com9.setBounds(50,450,150,60);
com9.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com9);


JLabel com10=new JLabel("10.Infosys");
com10.setBounds(50,500,150,60);
com10.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com10);

JLabel com11=new JLabel("11.Genpact");
com11.setBounds(50,550,150,60);
com11.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com11);



JLabel com12=new JLabel("12.IBM");
com12.setBounds(50,600,150,60);
com12.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com12);



JLabel com13=new JLabel("13.SAP");
com13.setBounds(50,650,150,60);
com13.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com13);


JLabel com14=new JLabel("14.Symantec");
com14.setBounds(50,700,150,60);
com14.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com14);

JLabel com15=new JLabel("15.Byjus");
com15.setBounds(50,750,150,60);
com15.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com15);


JLabel com16=new JLabel("16.Amazon");
com16.setBounds(50,800,150,60);
com16.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com16);

Label com17=new Label("17.jpmorgan");
com17.setBounds(400,50,200,60);
com17.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com17);

Label com18=new Label("18.General Motors");
com18.setBounds(400,100,200,60);
com18.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com18);

Label com19=new Label("19.Facebook");
com19.setBounds(400,150,200,60);
com19.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com19);

Label com20=new Label("20.GMR");
com20.setBounds(400,200,200,60);
com20.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com20);

Label com21=new Label("21.L&T");
com21.setBounds(400,250,200,60);
com21.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com21);

Label com22=new Label("22.xiaomi");
com22.setBounds(400,300,200,60);
com22.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com22);

Label com23=new Label("23.Wipro");
com23.setBounds(400,350,200,60);
com23.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com23);

Label com24=new Label("24.Yahoo");
com24.setBounds(400,400,200,60);
com24.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com24);

Label com25=new Label("25.TCS");
com25.setBounds(400,450,200,60);
com25.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com25);

Label com26=new Label("26.Nokia");
com26.setBounds(400,500,200,60);
com26.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com26);

Label com27=new Label("27.Samsung");
com27.setBounds(400,550,200,60);
com27.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com27);

Label com28=new Label("28.AirBus");
com28.setBounds(400,600,200,60);
com28.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com28);


Label com29=new Label("29.Boeing");
com29.setBounds(400,650,200,60);
com29.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com29);


Label com30=new Label("30.Twitter");
com30.setBounds(400,700,200,60);
com30.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com30);


Label com31=new Label("31.DLF");
com31.setBounds(400,750,200,60);
com31.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com31);

Label com32=new Label("32.Tencent");
com32.setBounds(400,800,200,60);
com32.setFont(new Font("Ariel", Font.BOLD ,20));
t.add(com32);



}
}


//recruiters login
class RecruitersLogin
{
RecruitersLogin()
{JFrame t = new JFrame();
t.setTitle("Recruiterslogin");
t.setVisible(true);
t.setBounds(200,100,600,500);

t.setLayout(null);

Container cntr=t.getContentPane();
cntr.setLayout(null);
cntr.setBackground(Color.PINK);

JLabel name=new JLabel("username");
name.setBounds(50,50,60,30);
t.add(name);

JTextField name_tf = new JTextField();
name_tf.setBounds(150,50,100,30);
t.add(name_tf);

JLabel password=new JLabel("password");
password.setBounds(50,150,60,30);
t.add(password);

JPasswordField psw_tf=new JPasswordField();
psw_tf.setBounds(150,150,100,30);
t.add(psw_tf);

JButton subm=new JButton("submit");
subm.setBounds(100,355,80,40);
t.add(subm);
subm.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

String s1 = name_tf.getText();
String s2 = psw_tf.getText();
if(s1.equals("sai") && s2.equals("java")||s1.equals("harsha") && s2.equals("java")){
t.setVisible(false);
}
if(s1.equals("sai") && s2.equals("java")||s1.equals("harsha") && s2.equals("java")){
JFrame frame = new JFrame();
frame.setTitle("Recruiters login");
frame.setVisible(true);

frame.setSize(1100,1100);

frame.setLayout(null);
JButton btn4 =new JButton("Logout");
btn4.setBounds(500,30,100,40);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
frame.dispose();
}});
frame.add(btn4);

JLabel titl=new JLabel("Create a job");
titl.setBounds(50,30,300,30);
titl.setFont(new Font("Ariel", Font.BOLD ,20));

JLabel name=new JLabel("Job Title");
name.setBounds(50,100,60,30);
JTextField name_tf = new JTextField();
name_tf.setBounds(200,100,170,30);

JLabel name1=new JLabel("Company Name");
name1.setBounds(50,150,100,30);
JTextField name1_tf = new JTextField();
name1_tf.setBounds(200,150,170,30);

JLabel name2=new JLabel("Job Description");
name2.setBounds(50,200,100,30);
JTextField name2_tf = new JTextField();
name2_tf.setBounds(200,200,170,30);

JLabel name3=new JLabel("Experience");
name3.setBounds(50,250,100,30);
JTextField name3_tf = new JTextField();
name3_tf.setBounds(200,250,170,30);

JLabel name4=new JLabel("Job Location");
name4.setBounds(50,300,100,30);
JTextField name4_tf = new JTextField();
name4_tf.setBounds(200,300,170,30);

JLabel name5=new JLabel("Cut Off Percentage");
name5.setBounds(50,350,100,30);
JTextField name5_tf = new JTextField();
name5_tf.setBounds(200,350,170,30);

JLabel name6=new JLabel("Key Skills");
name6.setBounds(50,400,60,30);
JTextField name6_tf = new JTextField();
name6_tf.setBounds(200,400,200,150);

JButton submi =new JButton("submit");
submi.setBounds(200,600,120,30);
submi.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
if((name_tf.getText().trim().length()!= 0 )&&(name1_tf.getText().trim().length()!= 0 )&&(name2_tf.getText().trim().length()!= 0 )&&(name3_tf.getText().trim().length()!= 0 )&&(name4_tf.getText().trim().length()!= 0 )&&(name5_tf.getText().trim().length()!= 0 )&&(name6_tf.getText().trim().length()!= 0 ))
{
JFrame j1=new JFrame();
Font lg1=new Font("Arial",Font.BOLD,20);
JLabel ls2=new JLabel("THANK U FOR JOINING US!!!");

j1.setSize(1000,1000);
j1.setLayout(null);
j1.setVisible(true);
j1.setBackground(Color.ORANGE);
ls2.setBounds(400,100,1000,400);
j1.add(ls2);
ls2.setFont(lg1);
}
else
{
JFrame j2=new JFrame();
Font lg2=new Font("Arial",Font.BOLD,20);
JLabel ls3=new JLabel("All the fields are mandatory!!!");
j2.setSize(1000,1000);
j2.setLayout(null);
j2.setVisible(true);
j2.setBackground(Color.ORANGE);
ls3.setBounds(400,100,1000,400);
j2.add(ls3);
ls3.setFont(lg2);
}
}});


frame.add(name);
frame.add(name1);
frame.add(name2);
frame.add(name3);
frame.add(name4);
frame.add(name5);
frame.add(name6);
frame.add(name_tf);
frame.add(name1_tf);
frame.add(name2_tf);
frame.add(name3_tf);
frame.add(name4_tf);
frame.add(name5_tf);
frame.add(name6_tf);
frame.add(titl);
frame.add(submi);
}
}});

}
}




//after clicking jobs button


class Jobs extends Frame 
{
Jobs()
{

JFrame n = new JFrame();
n.setTitle("Jobs");
n.setVisible(true);
n.setSize(1000,1000);
n.setLayout(null);
JLabel d=new JLabel("Select the category");
d.setBounds(270,50,700,150);
d.setFont(new Font("Ariel", Font.BOLD ,35));
JButton btn1=new JButton("IT");
JButton btn2=new JButton("Manufacturing");
JButton btn3=new JButton("Logistics");
JButton btn4=new JButton("Bank");
JButton btn5=new JButton("Management");
JButton btn6=new JButton("Teaching");

JButton btn9 =new JButton("back");
btn9.setBounds(30,30,70,70);
btn9.setBackground(Color.YELLOW);

btn9.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
n.dispose();
}});

n.add(btn9);


Cursor cur=new Cursor(Cursor.HAND_CURSOR);

btn1.setBounds(50,200,100,40);
btn1.setBackground(Color.YELLOW);
btn1.setCursor(cur);
btn1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
It j=new It();
}});

btn2.setBounds(200,200,100,40);
btn2.setCursor(cur);
btn2.setBackground(Color.YELLOW);
btn2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
Manufacture x=new Manufacture();
}});

btn3.setBounds(350,200,100,40);
btn3.setCursor(cur);
btn3.setBackground(Color.YELLOW);
btn3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
Logistics o=new Logistics();
}});

btn4.setBounds(500,200,100,40);
btn4.setCursor(cur);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
Bank x=new Bank();
}});

btn5.setBounds(650,200,100,40);
btn5.setCursor(cur);
btn5.setBackground(Color.YELLOW);
btn5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
Management x=new Management();
}});

btn6.setBounds(800,200,100,40);
btn6.setCursor(cur);
btn6.setBackground(Color.YELLOW);
btn6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
Teaching x=new Teaching();
}});




n.add(btn1);
n.add(btn2);
n.add(btn3);
n.add(btn4);
n.add(btn5);
n.add(btn6);
n.add(d);
}
}







class It
{


It()
{
JFrame a =new JFrame();
a.setTitle("IT jobs");
a.setVisible(true);
a.setSize(1200,1200);

a.setLayout(null);
JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);
Cursor cur=new Cursor(Cursor.HAND_CURSOR);


Label q=new Label("web Developer at busigence technologies-Bengaluru");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
a.add(b1);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}

}
});
}});

JLabel w=new JLabel("Software Engineer at Infosys-Hyderabad");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




Label e=new Label("Assistent manager post vaccant at TCS-New Delhi");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




Label r=new Label("Data entry part time job at ICICI bank-Mumbai");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




Label c=new Label("Android developers at apple-Hyderabad");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);
b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label y=new Label("software Engineers at Covalence Technologies-Hyderabad");
y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




Label u=new Label("technician at Apple service centre-Hyderabad");
u.setBounds(30,560,800,30);
u.setFont(new Font("Ariel", Font.BOLD ,20));
Button b7 =new Button("Apply now");
b7.setBounds(1000,560,80,30);
b7.setBackground(Color.YELLOW);
b7.setCursor(cur);
b7.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




Label x=new Label("senior program manager at oracle-Mumbai");
x.setBounds(30,640,800,30);
x.setFont(new Font("Ariel", Font.BOLD ,20));
Button b8 =new Button("Apply now");
b8.setBounds(1000,640,80,30);
b8.setBackground(Color.YELLOW);
b8.setCursor(cur);
b8.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});




a.add(q);
a.add(w);
a.add(e);
a.add(r);
a.add(c);
a.add(y);
a.add(u);
a.add(x);

a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);
a.add(b7);
a.add(b8);


}


}



class Management{
Management()
{
JFrame a = new JFrame();
a.setTitle("Management jobs");
a.setVisible(true);
a.setSize(1200,1200);
a.setLayout(null);
JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);
Cursor cur=new Cursor(Cursor.HAND_CURSOR);

Label q=new Label("Assistent manager at Novotel     New Delhi");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




JLabel w=new JLabel("Marketing Executive at cipla    Hyderabad");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label e=new Label("Management Trainee at Orient Electricals      Meerut");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label r=new Label("Assistent manager at Foxconn     Chennai");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label c=new Label("Marketing Executive at Agrifoods     Assam");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);
b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label y=new Label("Management Trainee at Gulf Lubricants       Secunderabad");
y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label u=new Label("Store manager at Walmart       Amritsar");

u.setBounds(30,560,800,30);
u.setFont(new Font("Ariel", Font.BOLD ,20));
Button b7 =new Button("Apply now");
b7.setBounds(1000,560,80,30);
b7.setBackground(Color.YELLOW);
b7.setCursor(cur);
b7.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});





a.add(q);
a.add(w);
a.add(e);
a.add(r);
a.add(c);
a.add(y);
a.add(u);
a.add(b1);
a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);
a.add(b7);



}

}




class Bank{
Bank()
{
JFrame a = new JFrame();
a.setTitle("bank jobs");
a.setVisible(true);
a.setSize(1200,1200);

a.setLayout(null);
JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);
Cursor cur=new Cursor(Cursor.HAND_CURSOR);

Label q=new Label("Bank Manager required at ICICI     Chennai");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});




JLabel w=new JLabel("Business Sales officer at HDFC Bank      Kolkata");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label e=new Label("junior associates at Central Bank     New Delhi");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label r=new Label("Deputy General manager required at SBI     Hyderabad");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label c=new Label("Assistent Deputy Manager at Syndicate Bank       Secunderabad");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);
b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label y=new Label("Finance Executive at City Bank      Hyderabad");
y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});



Label u=new Label("Bussiness Sales Officer at HDFC   Mumbai");

u.setBounds(30,560,800,30);
u.setFont(new Font("Ariel", Font.BOLD ,20));
Button b7 =new Button("Apply now");
b7.setBounds(1000,560,80,30);
b7.setBackground(Color.YELLOW);
b7.setCursor(cur);
b7.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}


}
});
}});






a.add(q);
a.add(w);
a.add(e);
a.add(r);
a.add(c);
a.add(y);
a.add(u);
a.add(b1);
a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);
a.add(b7);


}

}











class Manufacture{
Manufacture()
{
JFrame a = new JFrame();
a.setTitle("Manufacture Jobs");
a.setVisible(true);
a.setSize(1200,1200);

a.setLayout(null);

JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);
Cursor cur=new Cursor(Cursor.HAND_CURSOR);
Label q=new Label("Front Office Executive at Amar India Industries      Hyderabad");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



JLabel w=new JLabel("Distribution and development manager at Granules India Limited    Hyderabad  ");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});



Label e=new Label("Area Sales manager at Rockwell Industries Limited      Mumbai");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label r=new Label("Brand Manager at Enmax Engineering      Kolkata");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label c=new Label("Plant Head at Benny N Benny       Delhi");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);
b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label y=new Label("Production Engineer at DLF     Delhi");
y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label x=new Label("Office Assistent at D.E.Shaw India Private Limited        Chennai");
x.setBounds(30,560,800,30);
x.setFont(new Font("Ariel", Font.BOLD ,20));
Button b7 =new Button("Apply now");
b7.setBounds(1000,560,80,30);
b7.setBackground(Color.YELLOW);
b7.setCursor(cur);
b7.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



a.add(r);
a.add(q);
a.add(w);
a.add(e);
a.add(c);
a.add(y);
a.add(x);
a.add(b1);
a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);
a.add(b7);



}

}







class Logistics{
Logistics()
{
JFrame a = new JFrame();
a.setTitle("Logistics Jobs");
a.setVisible(true);
a.setSize(1200,1200);

a.setLayout(null);
JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);
Cursor cur=new Cursor(Cursor.HAND_CURSOR);
Label q=new Label("Logistics Operational Manger at Jasper industries");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));

Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



JLabel w=new JLabel("Logistics Executive in E-Retail Management Solutions");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));

Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label e=new Label("INFOR Manufacturing and Logistics consultant at Sailotech");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label r=new Label("Customer Operations Manager at Future Supply Chains Solution Limited");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label c=new Label("Territory Sales Executive at Abbot");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);
b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label y=new Label("Senior Territory Sales Executive at Abbot");
y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});




a.add(r);

a.add(q);                  
a.add(w);
a.add(e);
a.add(c);
a.add(y);
a.add(b1);
a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);

}

}








class Teaching{
Teaching()
{
JFrame a = new JFrame();
a.setTitle("TeachingJobs");
a.setVisible(true);
a.setSize(1200,1200);

a.setLayout(null);
JButton btn4=new JButton("back");
btn4.setBounds(30,10,80,30);
btn4.setBackground(Color.YELLOW);
btn4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
a.dispose();
}});
a.add(btn4);

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
Label q=new Label("proffessor at KLU");
q.setBounds(30,80,800,30);
q.setFont(new Font("Ariel", Font.BOLD ,20));
Button b1 =new Button("Apply now");
b1.setBounds(1000,80,80,30);
b1.setBackground(Color.YELLOW);
b1.setCursor(cur);
b1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});




JLabel w=new JLabel("Assistent proffesor at Delhi University");
w.setBounds(30,160,800,30);
w.setFont(new Font("Ariel", Font.BOLD ,20));
Button b2 =new Button("Apply now");
b2.setBounds(1000,160,80,30);
b2.setBackground(Color.YELLOW);
b2.setCursor(cur);
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});




Label e=new Label("Geopolitics Teaching at Delhi Public school");
e.setBounds(30,240,800,30);
e.setFont(new Font("Ariel", Font.BOLD ,20));
Button b3 =new Button("Apply now");
b3.setBounds(1000,240,80,30);
b3.setBackground(Color.YELLOW);
b3.setCursor(cur);
b3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}



}
});
}});




Label r=new Label("Computer programming Teaching at Army School ");
r.setBounds(30,320,800,30);
r.setFont(new Font("Ariel", Font.BOLD ,20));
Button b4 =new Button("Apply now");
b4.setBounds(1000,320,80,30);
b4.setBackground(Color.YELLOW);
b4.setCursor(cur);
b4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});




Label c=new Label("Lab Technician at Manipal Institutions");
c.setBounds(30,400,800,30);
c.setFont(new Font("Ariel", Font.BOLD ,20));
Button b5 =new Button("Apply now");
b5.setBounds(1000,400,80,30);

b5.setBackground(Color.YELLOW);
b5.setCursor(cur);
b5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});



Label y=new Label("Maths Proffesor at Gitam University");

y.setBounds(30,480,800,30);
y.setFont(new Font("Ariel", Font.BOLD ,20));
Button b6 =new Button("Apply now");
b6.setBounds(1000,480,80,30);
b6.setBackground(Color.YELLOW);
b6.setCursor(cur);
b6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent l){
JButton b1=new JButton("SUBMIT");
JFrame f=new JFrame();

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
JLabel label=new JLabel("NAME");
JLabel label1=new JLabel("EXPIRIENCE");
JLabel label3=new JLabel("WHY SHOULD WE HIRE YOU");
JLabel label2=new JLabel("SKILLS");
label.setBounds(100,100,100,40);
label1.setBounds(100,200,300,40);
label2.setBounds(100,300,100,40);
label3.setBounds(100,400,500,80);


JTextField tf=new JTextField();
JTextField tf1=new JTextField();
JTextArea tf2=new JTextArea();
JTextArea tf3=new JTextArea();

f.add(label);
f.add(label1);
f.add(label2);
f.add(label3);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.setBackground(Color.ORANGE);


Font fg=new Font("Arial",Font.BOLD,20);
label.setFont(fg);
label1.setFont(fg);
label2.setFont(fg);
label3.setFont(fg);
tf.setBounds(250,100,100,40);
tf1.setBounds(250,200,100,40);
tf2.setBounds(250,300,400,100);
tf3.setBounds(100,460,600,150);
b1.setBounds(150,640,100,40);
tf.setFont(fg);
f.add(tf);
tf1.setFont(fg);
f.add(tf1);
tf2.setFont(fg);
f.add(tf2);
tf3.setFont(fg);
f.add(tf3);
f.add(b1);
b1.setCursor(cur);
b1.setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if((tf.getText().trim().length()!= 0 )&&(tf1.getText().trim().length()!= 0 )&&(tf2.getText().trim().length()!= 0 )&&(tf3.getText().trim().length()!= 0 ))
{
JFrame jf=new JFrame();
Font lg=new Font("Arial",Font.BOLD,20);
JLabel ls=new JLabel("THANK U FOR APPLYING!!!");
f.dispose();
jf.setSize(1000,1000);
jf.setLayout(null);
jf.setVisible(true);
jf.setBackground(Color.ORANGE);
ls.setBounds(400,100,1000,400);
jf.add(ls);
ls.setFont(lg);
}
else
{
JFrame jf1=new JFrame();
JLabel ls1=new JLabel("KINDLY ENTER ALL THE DETAIlS!!!");
Font lg1=new Font("Arial",Font.BOLD,20);
jf1.setSize(1000,1000);
jf1.setLayout(null);
jf1.setVisible(true);
jf1.setBackground(Color.ORANGE);
ls1.setBounds(400,100,1000,400);
jf1.add(ls1);
ls1.setFont(lg1);
}




}
});
}});






a.add(q);
a.add(w);
a.add(e);
a.add(r);
a.add(c);
a.add(y);
a.add(b1);
a.add(b2);
a.add(b3);
a.add(b4);
a.add(b5);
a.add(b6);





}

}
