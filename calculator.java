import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Math.*;
import java.io.File;
import javax.imageio.ImageIO;


public class calculator {
	public static void main(String[] args){
		JFrame f=new JFrame("Calculator");
		  try {
            		f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("test.jpg")))));
       		      } catch (Exception e) {
            		System.out.println("File(Background picture) not Found Exception!!");
       					      }
        	f.pack();
		f.setLayout(null); 
		f.setSize(1000,550); 
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		JLabel lhistry=new JLabel("Complete Operation");
		lhistry.setBounds(200,420,250,20);
		f.add(lhistry);
		JTextField histry=new JTextField("");
		histry.setBounds(330,420,250,30);
		f.add(histry);
		JLabel title=new JLabel("Scientific Calculator");
		title.setBounds(370,30,200,30);
		title.setFont(title.getFont().deriveFont(18f));
		f.add(title);
		JLabel lbase=new JLabel("Base");
		lbase.setBounds(80,80,80,20);
		f.add(lbase);
		JLabel lx=new JLabel("x");
		lx.setBounds(80,100,80,20);
		f.add(lx);
		JLabel l1st_number=new JLabel("1st Number");
		l1st_number.setBounds(80,120,80,20);
		f.add(l1st_number);
		JLabel lperpendicular=new JLabel("Perpendicular");
		lperpendicular.setBounds(180,80,100,20);
		f.add(lperpendicular);
		JLabel ly=new JLabel("y");
		ly.setBounds(180,100,80,20);
		f.add(ly);
		JLabel l2nd_number=new JLabel("2nd Number");
		l2nd_number.setBounds(180,120,80,20);
		f.add(l2nd_number);
		JTextField t1st_number=new JTextField(""); 
		t1st_number.setBounds(80,140,80,30); 
		f.add(t1st_number);
		JTextField t2nd_number=new JTextField(""); 
		t2nd_number.setBounds(180,140,80,30); 
		f.add(t2nd_number);
		JLabel lresult=new JLabel("Result");
		lresult.setBounds(330,350,250,20);
		f.add(lresult);
		JTextField tresult=new JTextField(""); 
		tresult.setBounds(330,370,250,30); 
		f.add(tresult);
		JButton reset1=new JButton("Reset"); 
		reset1.setBounds(280,140,70,30); 
		reset1.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(reset1);
		JButton plus=new JButton("+"); 
		plus.setBounds(70,200,70,30); 
		plus.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(plus);
		JButton mins=new JButton("-"); 
		mins.setBounds(160,200,70,30); 
		mins.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(mins); 
		JButton mul=new JButton("*"); 
		mul.setBounds(250,200,70,30); 
		mul.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(mul);
		JButton rem=new JButton("/"); 
		rem.setBounds(70,240,70,30); 
		rem.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(rem);
		JButton hyp=new JButton("Hyp"); 
		hyp.setBounds(160,240,70,30); 
		hyp.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(hyp);
		JButton div=new JButton("%"); 
		div.setBounds(160,280,70,30); 
		div.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(div); 
		JButton pow=new JButton("x^y"); 
		pow.setBounds(250,240,70,30); 
		pow.addActionListener(new eventHandler(t1st_number,t2nd_number,tresult,histry)); 
		f.add(pow);
		JTextField seperation=new JTextField();
		seperation.setBounds(380,80,5,230);
		f.add(seperation);


//Frame#2
	JFrame f2=new JFrame("GPA Calculator");
	f2.setSize(800,600);
	f2.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f2.setLayout(null);
	f2.setResizable(false);
	
	//Labels
	JLabel crsl=new JLabel("Course");
	crsl.setBounds(80,80,150,30);
	JLabel obtainl=new JLabel("Obtained");
	obtainl.setBounds(280,80,100,30);
	JLabel totall=new JLabel("Total");
	totall.setBounds(430,80,100,30);
	JLabel crdtl=new JLabel("Credit Hrs");
	crdtl.setBounds(580,80,100,30);
	//C1
	JTextField c1t1=new JTextField("");
	c1t1.setBounds(80,120,150,30);
	JTextField c1t2=new JTextField("0");
	c1t2.setBounds(280,120,100,30);
	JTextField c1t3=new JTextField("0");
	c1t3.setBounds(430,120,100,30);
	JTextField c1t4=new JTextField("0");
	c1t4.setBounds(580,120,100,30);
	//C2
	JTextField c2t1=new JTextField("");
	c2t1.setBounds(80,160,150,30);
	JTextField c2t2=new JTextField("0");
	c2t2.setBounds(280,160,100,30);
	JTextField c2t3=new JTextField("0");
	c2t3.setBounds(430,160,100,30);
	JTextField c2t4=new JTextField("0");
	c2t4.setBounds(580,160,100,30);
	//C3
	JTextField c3t1=new JTextField("");
	c3t1.setBounds(80,200,150,30);
	JTextField c3t2=new JTextField("0");
	c3t2.setBounds(280,200,100,30);
	JTextField c3t3=new JTextField("0");
	c3t3.setBounds(430,200,100,30);
	JTextField c3t4=new JTextField("0");
	c3t4.setBounds(580,200,100,30);
	//C4
	JTextField c4t1=new JTextField("");
	c4t1.setBounds(80,240,150,30);
	JTextField c4t2=new JTextField("0");
	c4t2.setBounds(280,240,100,30);
	JTextField c4t3=new JTextField("0");
	c4t3.setBounds(430,240,100,30);
	JTextField c4t4=new JTextField("0");
	c4t4.setBounds(580,240,100,30);
	//C5
	JTextField c5t1=new JTextField("");
	c5t1.setBounds(80,280,150,30);
	JTextField c5t2=new JTextField("0");
	c5t2.setBounds(280,280,100,30);
	JTextField c5t3=new JTextField("0");
	c5t3.setBounds(430,280,100,30);
	JTextField c5t4=new JTextField("0");
	c5t4.setBounds(580,280,100,30);
	//C6
	JTextField c6t1=new JTextField("");
	c6t1.setBounds(80,320,150,30);
	JTextField c6t2=new JTextField("0");
	c6t2.setBounds(280,320,100,30);
	JTextField c6t3=new JTextField("0");
	c6t3.setBounds(430,320,100,30);
	JTextField c6t4=new JTextField("0");
	c6t4.setBounds(580,320,100,30);
	//C7
	JTextField c7t1=new JTextField("");
	c7t1.setBounds(80,360,150,30);
	JTextField c7t2=new JTextField("0");
	c7t2.setBounds(280,360,100,30);
	JTextField c7t3=new JTextField("0");
	c7t3.setBounds(430,360,100,30);
	JTextField c7t4=new JTextField("0");
	c7t4.setBounds(580,360,100,30);

	//C8
	JTextField c8t1=new JTextField("");
	c8t1.setBounds(80,400,150,30);
	JTextField c8t2=new JTextField("0");
	c8t2.setBounds(280,400,100,30);
	JTextField c8t3=new JTextField("0");
	c8t3.setBounds(430,400,100,30);
	JTextField c8t4=new JTextField("0");
	c8t4.setBounds(580,400,100,30);

	//C9
	JTextField c9t1=new JTextField("");
	c9t1.setBounds(80,440,150,30);
	JTextField c9t2=new JTextField("0");
	c9t2.setBounds(280,440,100,30);
	JTextField c9t3=new JTextField("0");
	c9t3.setBounds(430,440,100,30);
	JTextField c9t4=new JTextField("0");
	c9t4.setBounds(580,440,100,30);

	//C10
	JTextField c10t1=new JTextField("");
	c10t1.setBounds(80,480,150,30);
	JTextField c10t2=new JTextField("0");
	c10t2.setBounds(280,480,100,30);
	JTextField c10t3=new JTextField("0");
	c10t3.setBounds(430,480,100,30);
	JTextField c10t4=new JTextField("0");
	c10t4.setBounds(580,480,100,30);
 	
	//Quit	Button
	JButton quit=new JButton("Quit");
	quit.setBounds(600,520,100,30);
	quit.addActionListener(new gpaHandler());
	
	//Result labels
	JLabel Tgpal=new JLabel("Total GPA");
	Tgpal.setBounds(80,490,150,20);
	
	JLabel Tgradel=new JLabel("Grade");
	Tgradel.setBounds(500,490,100,20);
	//Result Fields
	JTextField Tgpa=new JTextField("");
	Tgpa.setBounds(80,520,150,30);
	JTextField Tpercent=new JTextField("");
	Tpercent.setBounds(280,520,100,30);
	JTextField Tgrade=new JTextField("");
	Tgrade.setBounds(480,520,100,30);
	//calculate Button
	JButton calculateb=new JButton("Calculate GPA");
	calculateb.setBounds(80,450,150,30);
	calculateb.addActionListener(new gpaHandler(c1t2,c1t3,c1t4,c2t2,c2t3,c2t4,c3t2,c3t3,c3t4,c4t2,c4t3,c4t4,c5t2,c5t3,
					c5t4,c6t2,c6t3,c6t4,c7t2,c7t3,c7t4,Tgpa,Tgrade));
	//Reset Button
	JButton resetb=new JButton("Reset");
	resetb.setBounds(600,430,100,30);
	resetb.addActionListener(new gpaHandler(c1t2,c1t3,c1t4,c2t2,c2t3,c2t4,c3t2,c3t3,c3t4,c4t2,c4t3,c4t4,c5t2,c5t3,
					c5t4,c6t2,c6t3,c6t4,c7t2,c7t3,c7t4,Tgpa,Tgrade));
	f2.add(resetb);
	//Back Button
	JButton back=new JButton("<--Back");
	back.setBounds(80,50,100,30); f2.add(back);
	back.addActionListener(new gpaHandler(f,f2));




//Frame 2	

	
		
		JLabel lnumber=new JLabel("Enter Number");
		lnumber.setBounds(550,80,150,20);
		f.add(lnumber);		
		JTextField tnumber=new JTextField(""); 
		tnumber.setBounds(550,100,120,30); 
		f.add(tnumber);
		
		JButton bi=new JButton("Binary"); 
		bi.setBounds(450,160,90,30); 
		bi.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(bi);
		JButton oct=new JButton("Octal"); 
		oct.setBounds(560,160,90,30); 
		oct.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(oct); 
		JButton hex=new JButton("Hexadecimal"); 
		hex.setBounds(670,160,90,30); 
		hex.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(hex);
		JButton fac=new JButton("X!(<25)"); 
		fac.setBounds(780,160,90,30); 
		fac.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(fac);
		JButton sin=new JButton("Sin"); 
		sin.setBounds(450,200,90,30); 
		sin.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(sin);
		JButton cos=new JButton("Cos"); 
		cos.setBounds(560,200,90,30); 
		cos.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(cos); 
		JButton tan=new JButton("Tan"); 
		tan.setBounds(670,200,90,30); 
		tan.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(tan);
		JButton sqr=new JButton("Sqrt"); 
		sqr.setBounds(780,200,90,30); 
		sqr.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(sqr); 
		JButton log=new JButton("log"); 
		log.setBounds(450,240,90,30); 
		log.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(log);
		JButton sinh=new JButton("Sinh"); 
		sinh.setBounds(560,240,90,30); 
		sinh.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(sinh); 
		JButton cosh=new JButton("Cosh"); 
		cosh.setBounds(670,240,90,30); 
		cosh.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(cosh);
		JButton tanh=new JButton("Tanh"); 
		tanh.setBounds(780,240,90,30); 
		tanh.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(tanh);
		JButton asin=new JButton("aSin"); 
		asin.setBounds(450,280,90,30); 
		asin.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(asin);
		JButton acos=new JButton("aCos"); 
		acos.setBounds(560,280,90,30); 
		acos.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(acos); 
		JButton atan=new JButton("aTan"); 
		atan.setBounds(670,280,90,30); 
		atan.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(atan);
		JButton round=new JButton("Round"); 
		round.setBounds(780,280,90,30); 
		round.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(round);
		JButton exp=new JButton("e^x"); 
		exp.setBounds(450,320,90,30); 
		exp.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(exp);
		JButton dtor=new JButton("deg>rad"); 
		dtor.setBounds(560,320,90,30); 
		dtor.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(dtor); 
		JButton ceil=new JButton("Ceilling"); 
		ceil.setBounds(670,320,90,30); 
		ceil.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(ceil);
		JButton flor=new JButton("Floor"); 
		flor.setBounds(780,320,90,30); 
		flor.addActionListener(new eventHandler(tnumber,tresult,histry)); 
		f.add(flor);
		
		f.setVisible(true);


		//Adding to Frame#2
	f2.add(crsl);
	f2.add(obtainl);
	f2.add(totall);
	f2.add(crdtl);
	f2.add(c1t1);
	f2.add(c1t2);
	f2.add(c1t3); f2.add(c1t4);
	f2.add(c2t1);
	f2.add(c2t2);
	f2.add(c2t3); f2.add(c2t4);
	f2.add(c3t1);
	f2.add(c3t2);
	f2.add(c3t3); f2.add(c3t4);
	f2.add(c4t1);
	f2.add(c4t2);
	f2.add(c4t3); f2.add(c4t4);
	f2.add(c5t1);
	f2.add(c5t2);
	f2.add(c5t3); f2.add(c5t4);
	f2.add(c6t1);
	f2.add(c6t2);
	f2.add(c6t3); f2.add(c6t4);
	f2.add(c7t1);
	f2.add(c7t2);
	f2.add(c7t3); f2.add(c7t4);
	f2.add(quit);
	f2.add(calculateb);
	f2.add(Tgpal);
	f2.add(Tgradel);	
	f2.add(Tgpa);
	
	f2.add(Tgrade);	  
	f2.setVisible(false);
//////////////

	JButton gpa=new JButton("GPA Calculator"); 
	gpa.setBounds(70,370,150,30); 
	gpa.addActionListener(new eventHandler(f,f2)); 
	f.add(gpa);
	gpa.addActionListener(new eventHandler(f,f2));
}
}
class eventHandler implements ActionListener{
	JTextField n1,n2,res,his; boolean flag=false; String h="",na="",nb="",nr="",result="";JButton butt;
	JFrame f,f2;
	eventHandler(){}
	eventHandler(JTextField num1,JTextField num2,JTextField result,JTextField histry){
			n1=num1; n2=num2; res=result; his=histry; h=his.getText(); flag=true;
								}
	eventHandler(JTextField num1,JTextField result ,JTextField histry){
			n1=num1; res=result; his=histry; h=his.getText();
						     }
	eventHandler(JTextField num1,JTextField histry){
			n1=num1; his=histry; h=his.getText();}
	eventHandler(JFrame fr,JFrame fr2){
			f=fr; f2=fr2;
			}					    
	public void actionPerformed(ActionEvent ae){
		
		butt=(JButton)ae.getSource();
		String str=butt.getText(); boolean check=false;
		double r=0.0;
		double b=0.0;
		double a=0.0;
		if(str.equals("GPA Calculator")){f.setVisible(false); f2.setVisible(true); return;}
		if(str.equals("Reset")){
					n1.setText(""); n2.setText(""); res.setText(""); return;
					}
		else if((n1.getText()).equals("")){res.setText("Field is Empty!!"); return;}

		if(!((n1.getText()).equals(""))){
		na=n1.getText(); check=true;
		a=Double.parseDouble(n1.getText());
		if(flag){
		h=his.getText();  
			b=Double.parseDouble(n2.getText()); 
			nb=n2.getText();
			}
				      }

			r=0.0;
			switch(str){
				case "+":
					r=a+b; result=""+r;
					his.setText(h+na+" + "+nb+" = "+result+"    ");
				break;
				case "-":
					r=a-b; result=""+r; his.setText(h+na+" - "+nb+" = "+result+"    ");
				break;
				case "*":
					r=a*b; result=""+r; his.setText(h+na+" x "+nb+" = "+result+"    ");
				break;
				case "/":
					r=a/b; result=""+r; his.setText(h+na+" / "+nb+" = "+result+"    ");
				break;
				case "%":
					r=a%b; result=""+r; his.setText(h+na+" % "+nb+" = "+result+"    ");
				break;
				case "Hyp":
					r=Math.hypot(b,a); result=""+r; his.setText(h+"Base("+na+") & prep("+nb+") so hyp("+result+")    ");
				break;
				case "x^y":
					r=Math.pow(a,b); result=""+r; his.setText(h+na+" ^ "+nb+" = "+result+"    ");
				break;
				case "Sin":
					a=Math.toRadians(a);
					r=Math.sin(a); result=""+r; his.setText(h+" sin("+na+")= "+result+"    ");
				break;
				case "Cos":
					a=Math.toRadians(a);
					r=Math.cos(a); result=""+r; his.setText(h+" cos("+na+")= "+result+"    ");
				break;
				case "Tan":
					a=Math.toRadians(a);
					r=Math.tan(a); result=""+r; his.setText(h+" Tangent("+na+")= "+result+"    ");
				break;
				case "Sinh":
					a=Math.toRadians(a);
					r=Math.sinh(a); result=""+r; his.setText(h+" sinh("+na+")= "+result+"    ");
				break;
				case "Cosh":
					a=Math.toRadians(a);
					r=Math.cosh(a); result=""+r; his.setText(h+" cosh("+na+")= "+result+"    ");
				break;
				case "Tanh":
					a=Math.toRadians(a);
					r=Math.tanh(a); result=""+r; his.setText(h+" Tanh("+na+")= "+result+"    ");
				break;
				case "aSin":
					a=Math.toRadians(a);
					r=Math.asin(a); result=""+r; his.setText(h+" asin("+na+")= "+result+"    ");
				break;
				case "aCos":
					a=Math.toRadians(a);
					r=Math.acos(a); result=""+r; his.setText(h+" acos("+na+")= "+result+"    ");
				break;
				case "aTan":
					a=Math.toRadians(a);
					r=Math.atan(a); result=""+r; his.setText(h+" arcTangent("+na+")= "+result+"    ");
				break;
				case "Sqrt":
					r=Math.sqrt(a); result=""+r; his.setText(h+" Square root("+na+")= "+result+"    ");
				break;
				case "Round":
					r=Math.round(a); result=""+r; his.setText(h+" round("+na+")= "+result+"    ");
				break;
				case "log":
					r=Math.log(a); result=""+r; his.setText(h+" log("+na+")= "+result+"    ");
				break;
				case "e^x":
					
					r=Math.exp(a); result=""+r; his.setText(h+" e^("+na+")= "+result+"    ");
				break;
				case "deg>rad":
					r=Math.toRadians(a); result=""+r; his.setText(h+" In Rad("+na+")= "+result+"    ");
				break;
				case "Ceilling": 
					r=Math.ceil(a); result=""+r; his.setText(h+" ceil("+na+")= "+result+"    ");
				break;
				case "Floor":
					r=Math.floor(a);
					result=""+r; his.setText(h+" floor("+na+")= "+result+"    ");
				break;

				case "Binary":
					String bi="";
					int var=0,x=(int)a;
					for(int i=x;i>0;i/=2){
					var=(i%2); bi+=Integer.toString(var);} 
					char bin[]=bi.toCharArray();
					bi="";
					for(int i=(bin.length)-1;i>=0;i--) bi+=bin[i];
					 result=bi; his.setText(h+" In Binary("+na+")= "+result+"    ");
				break;
				case "Octal": 
						String oc="";
					var=0; x=(int)a;
					for(int i=x;i>0;i/=8){
					var=(i%8); oc+=Integer.toString(var);}
					char oct[]=oc.toCharArray();
					oc=""; 
					for(int i=(oct.length)-1;i>=0;i--) oc+=oct[i];
					 result=oc; his.setText(h+" In Binary("+na+")= "+result+"    ");
					result=oc; his.setText(h+" In Octal("+na+")= "+result+"    ");
				break;
				case "Hexadecimal":
					String he="",hexchar="";
					var=0; x=(int)a;
					for(int i=x;i>0;i/=16){
					var=(i%16); 
					switch(var){
						case 10: hexchar="a"; break;
						case 11: hexchar="b"; break;
						case 12: hexchar="c"; break;
						case 13: hexchar="d"; break;
						case 14: hexchar="e"; break;
						case 15: hexchar="f"; break;
						default: hexchar=Integer.toString(var);
							   }
					he+=hexchar;
						}
					char hexn[]=he.toCharArray(); 
					he=""; 
					for(int i=(hexn.length)-1;i>=0;i--) he+=hexn[i];
					result=he; his.setText(h+" In Hexadec("+na+")= "+result+"    ");
					break;
				case "X!(<25)":
					int num=(int)a;
					long fact=1;
					for(int i=1;i<=num;i++) fact*=i;
					result=""+fact; his.setText(h+" "+na+"!= "+result+"    ");
					break;
				}
			if(check)
			res.setText(result);
						}	
}
//////////////
class gpaHandler implements ActionListener{
	double cr[]=new double[7]; double obt[]=new double[7]; double tot[]=new double[7];
	boolean flag[]=new boolean[]{false,false,false,false,false,false,false};
	JTextField gpa,grade; JTextField tf[]=new JTextField[21];	
	JFrame f,f2;
	gpaHandler(){}
	gpaHandler(JFrame fr,JFrame fr2){f=fr; f2=fr2;}
	gpaHandler(JTextField... tfr){
		for(int i=0;i<21;i++) tf[i]=tfr[i];
		gpa=tfr[21]; grade=tfr[22];
		}
	public void actionPerformed(ActionEvent ae){
		JButton b=(JButton)ae.getSource();
		String str=b.getText(); 
		if(str.equals("<--Back")){f2.setVisible(false); f.setVisible(true); return;}
		if(str.equals("Reset")){for(int i=0;i<21;i++)tf[i].setText("0"); return;}
		double p=0.0;
		double[] allgpa=new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		if(str.equals("Quit")){
			System.exit(0);
					}
		else if(str.equals("Calculate GPA")){ 
		try{int count=0;
		for(int i=0;i<7;i++,count++){
				obt[i]=Double.parseDouble(tf[count].getText());
				count++;
				tot[i]=Double.parseDouble(tf[count].getText());
				count++;
				cr[i]=Double.parseDouble(tf[count].getText());
					    
					}
		} catch(Exception e){System.out.print("");}
				}
			for(int i=0;i<7;i++){
					p=(obt[i]*100)/tot[i];
					if(p>=93 &&p<=100 ) allgpa[i]=4.0 ;
					else if(p>=87 &&p<93 ) allgpa[i]=3.67 ;
					else if(p>=82 &&p<87 ) allgpa[i]=3.33 ;
					else if(p>=77 &&p<82 ) allgpa[i]=3.00 ;
					else if(p>=72 &&p<77 ) allgpa[i]=2.67 ;
					else if(p>=68 &&p<72 ) allgpa[i]=2.33 ;
					else if(p>=64 &&p<68 ) allgpa[i]=2.00 ;
					else if(p>=60 &&p<64 ) allgpa[i]=1.67 ;
					else if(p<60 ) allgpa[i]=0.00 ;	    
						}
		double tgpa=0.0,tcr=0.0;
		for(int i=0;i<7;i++){
			tgpa+=(allgpa[i]*cr[i]);
				    }
		for(int i=0;i<7;i++){
			tcr+=(cr[i]);
				    }
			tgpa/=tcr;
		gpa.setText(""+tgpa);
			if(tgpa>3.67 ) grade.setText("A");
			else if(tgpa>3.33 ) grade.setText("A-");
			else if(tgpa>3.00 ) grade.setText("B+");
			else if(tgpa>2.67 ) grade.setText("B");
			else if(tgpa>2.33 ) grade.setText("B-");
			else if(tgpa>2.00 ) grade.setText("C+");
			else if(tgpa>1.67 ) grade.setText("C");
			else if(tgpa==1.67 ) grade.setText("C-");
			else if(tgpa<1.67) grade.setText("F");					    						   
}
}