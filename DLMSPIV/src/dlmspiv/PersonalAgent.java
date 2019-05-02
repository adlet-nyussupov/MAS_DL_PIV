/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlmspiv;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Aziza
 */
public class PersonalAgent extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour(){
            @Override
            public void action() {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                //if(LableQ.tot){
                    msg.setContent("Normal level");
                    msg.addReceiver(new AID("student", AID.ISLOCALNAME));
                    send(msg);
                    
              //  }
            }
        });
    }
    
    
    
    
    public JFrame j1 = new JFrame();
    
    public static final int DEFAULT_WIDTH = 1920;
	public static final int DEFAULT_HEIGHT = 1080;

	private JComboBox quest1;
	
	private JComboBox quest2_1;
	private JComboBox quest2_2;
	private JComboBox quest2_3;
	private JComboBox quest2_4;
	private JComboBox quest2_5;
	
	private JComboBox quest3_1;
	private JComboBox quest3_2;

	private JComboBox quest4_1;
	private JComboBox quest4_2;
	
	private JComboBox quest5_1;
	private JComboBox quest5_2;
	private JComboBox quest5_3;
	private JComboBox quest5_4;

	
	private JTextField quest6;
	private JComboBox quest7;
	private JComboBox quest8;
	private JComboBox quest9;
	private JComboBox quest10;


	private JLabel label1;
	
	private JLabel label2;
	private JLabel label2_1;
	private JLabel label2_2;
	private JLabel label2_3;
	private JLabel label2_4;
	private JLabel label2_5;
	
	private JLabel label3;
	private JLabel label3_1;
	private JLabel label3_2;
	
	private JLabel label4;
	private JLabel label4_1;
	private JLabel label4_2;
	
	private JLabel label5;
	private JLabel label5_1;
	private JLabel label5_2;
	private JLabel label5_3;
	private JLabel label5_4;
	private JLabel label5_5;
	
	private JLabel label6;
	private JLabel label6_1;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	
	
	private JLabel result;

	
	
	private static final int DEFAULT_SIZE = 18;
	

	private static final String UPDATE_NEW = "UPDATE users SET levelDis = ? WHERE login = ?";
        PreparedStatement preparedStatement = null;

	public PersonalAgent() {
		
		Font font1 = new Font("Arial", Font.BOLD, DEFAULT_SIZE);
		Font font2 = new Font("Arial", Font.PLAIN, 14);
		
		j1.setTitle("Анкета для построения модели ЛОВЗ");
		j1.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		

		label1 = new JLabel(LableQ.Q1);
		label1.setFont(font1);
		label1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		label2 = new JLabel(LableQ.Q2);
		label2.setFont(font1);
		label2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label2_1 = new JLabel(LableQ.Q2_1);
		label2_1.setFont(font2);
		label2_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label2_2 = new JLabel(LableQ.Q2_2);
		label2_2.setFont(font2);
		label2_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label2_3 = new JLabel(LableQ.Q2_3);
		label2_3.setFont(font2);
		label2_3.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label2_4 = new JLabel(LableQ.Q2_4);
		label2_4.setFont(font2);
		label2_4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label2_5 = new JLabel(LableQ.Q2_5);
		label2_5.setFont(font2);
		label2_5.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label3 = new JLabel(LableQ.Q3);
		label3.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		label3.setFont(font1);
		label3_1 = new JLabel(LableQ.Q3_1);
		label3_1.setFont(font2);
		label3_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		label3_2 = new JLabel(LableQ.Q3_2);
		label3_2.setFont(font2);
		label3_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		label4 = new JLabel(LableQ.Q4);
		label4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label4.setFont(font1);
		label4_1 = new JLabel(LableQ.Q4_1);
		label4_1.setFont(font2);
		label4_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label4_2 = new JLabel(LableQ.Q4_2);
		label4_2.setFont(font2);
		label4_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		
		label5 = new JLabel(LableQ.Q5);
		label5.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label5.setFont(font1);
		label5_1 = new JLabel(LableQ.Q5_1);
		label5_1.setFont(font2);
		label5_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label5_2 = new JLabel(LableQ.Q5_2);
		label5_2.setFont(font2);
		label5_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label5_3 = new JLabel(LableQ.Q5_3);
		label5_3.setFont(font2);
		label5_3.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label5_4 = new JLabel(LableQ.Q5_4);
		label5_4.setFont(font2);
		label5_4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		label6 = new JLabel(LableQ.Q6);
		label6.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label6.setFont(font1);
		
		label6_1 = new JLabel(LableQ.Q6_1);
		label6_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label6_1.setFont(font2);
		
		
		label7 = new JLabel(LableQ.Q7);
		label7.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label7.setFont(font1);
		
		label8 = new JLabel(LableQ.Q8);
		label8.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label8.setFont(font1);
		
		label9 = new JLabel(LableQ.Q9);
		label9.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label9.setFont(font1);
		
		label10 = new JLabel(LableQ.Q10);
		label10.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label10.setFont(font1);
		
		
		
		

		

			

		//label2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		

		
		
		
		String[] items1 = {
				null,
			    "A. 17-20",
			    "B. Выше 21",
			    "С. Выше 35"
			};
		
		String[] items2_1 = {
				null,
			    "A. Исходя из практических соображений",
			    "B. Благодаря случайному стечению обстоятельств",
			    "С. Остановил свой выбор на первом, что более менее мне подошло"
			};
		String[] items2_2 = {
				null,
				"A. Да",
			    "B. Не очень",
			    "С. Нет"
			};
		String[] items2_3 = {
				null,
				"A. Да",
			    "B. Не очень",
			    "С. Нет"
			};
		String[] items2_4 = {
				null,
				"A. On-line",
			    "B. Off-line",
			    "С. Традиционное"
			};
		String[] items2_5 = {
				null,
				"A. высокая",
			    "B. средняя",
			    "С. низкая"
			};
		String[] items3_1 = {
				null,
				"A. Продолжаете начатое дело",
			    "B. Каокое-то время все равно продолжаете действовать",
			    "С. Отказываетесь от затеи как от нереальной"
			};
		String[] items3_2 = {
				null,
				"A. Не любите обращаться, решаете самомтоятельно",
			    "B. Спешите обратиться за помощью к другим",
			    "С. Оставляете все как есть"
			};
		String[] items4_1 = {
				null,
				"A. Да",
			    "B. Умеренно",
			    "С. Нет"
			};
		String[] items4_2 = {
				null,
				"A. Хорошая",
			    "B. Средняя",
			    "С. Плохая"
			};
		String[] items5_1 = {
				null,
				"A. Да",
			    "B. В некоторой степени",
			    "С. Нет"
			};
		
		String[] items5_2 = {
				null,
				"A. Да",
			    "B. Часто бывают сомнения ",
			    "С. Нет"
			};
		String[] items5_3 = {
				null,
				"A. Да, неизвестное меня привлекает",
			    "B. Все зависит от содержания этой области обучения ",
			    "С. Неизвестное меня не интересует"
			};
		String[] items5_4 = {
				null,
				"A. Да",
			    "B. Удовлетворитесь тем, чего смогли добиться ",
			    "С. Нет"
			};
		String[] items6 = {
				null,
			    "17-20",
			    "Выше 21",
			    "Выше 35"
			};
	
		
		String[] items7 = {
				null,
			    "180",
			    "156",
			    "189",
			    "190",
			    "200",
			    "230",
			    "250"
			};
		String[] items8 = {
				null,
				"A. Слуховое восприятие",
			    "B. Зрительное восприятие ",
			    "С. Осязание"
			};
		String[] items9 = {
				null,
				"A. При эмметропии(нормальном зрении) глаз видит буквы с обеих сторон одинаковыми по темноте и четкости.",
			    "B. Если символы кажутся более четкими на красном фоне, то существует большая вероятность наличия близорукости. ",
			    "С. Если на зеленом, то можно предположить наличие дальнозоркости."
			};
		
		String[] items10 = {
				null,
				"слабовидящие (с гиперметропией)",
			    "слабовидящие (с миопией) ",
			    "слепые",
			    "частично зрячие (с гиперметропией)",
			    "частично зрячие (с миопией)",
			    "эмметропия"
			};
		
		
		
		quest1 = new JComboBox(items1);
		quest1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest1.setMaximumSize(new Dimension(200, 20));

		
		quest2_1 = new JComboBox(items2_1);
		quest2_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest2_1.setMaximumSize(new Dimension(410, 20));
		quest2_2 = new JComboBox(items2_2) ;
		quest2_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest2_2.setMaximumSize(new Dimension(200, 20));
		quest2_3= new JComboBox(items2_3);
		quest2_3.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest2_3.setMaximumSize(new Dimension(200, 20));
		quest2_4= new JComboBox(items2_4);
		quest2_4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest2_4.setMaximumSize(new Dimension(200, 20));
		quest2_5= new JComboBox(items2_5);
		quest2_5.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest2_5.setMaximumSize(new Dimension(200, 20));
		
		quest3_1= new JComboBox(items3_1);
		quest3_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest3_1.setMaximumSize(new Dimension(350, 20));
		quest3_2= new JComboBox(items3_2);
		quest3_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest3_2.setMaximumSize(new Dimension(320, 20));

		quest4_1= new JComboBox(items4_1);
		quest4_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest4_1.setMaximumSize(new Dimension(200, 20));
		quest4_2= new JComboBox(items4_2);
		quest4_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest4_2.setMaximumSize(new Dimension(200, 20));
		
		quest5_1= new JComboBox(items5_1);
		quest5_1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest5_1.setMaximumSize(new Dimension(200, 20));
		quest5_2= new JComboBox(items5_2);
		quest5_2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest5_2.setMaximumSize(new Dimension(200, 20));
		quest5_3= new JComboBox(items5_3);
		quest5_3.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest5_3.setMaximumSize(new Dimension(330, 20));
		quest5_4= new JComboBox(items5_4);
		quest5_4.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest5_4.setMaximumSize(new Dimension(300, 20));

		
		//quest6= new JComboBox(items6);
		//quest6.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		//quest6.setMaximumSize(new Dimension(200, 20));
		quest7= new JComboBox(items7);
		quest7.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest7.setMaximumSize(new Dimension(200, 20));
		quest8= new JComboBox(items8);
		quest8.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest8.setMaximumSize(new Dimension(200, 20));
		quest9= new JComboBox(items9);
		quest9.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest9.setMaximumSize(new Dimension(720, 20));
		quest10= new JComboBox(items10);
		quest10.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		quest10.setMaximumSize(new Dimension(250, 20));
		
		
		quest6 = new JTextField(10);
		quest6.setMaximumSize(new Dimension(200, 20));
		
		

		

		
		
		
		JButton button = new JButton("Далее");
		

		ImageIcon icon = new ImageIcon(getClass().getResource("/res/6.png"));
		JLabel thumb = new JLabel();
		thumb.setIcon(icon);
		
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/res/9.png"));
		JLabel thumb1 = new JLabel();
		thumb1.setIcon(icon1);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				LableQ.A1 = (String) quest1.getSelectedItem();
				
				LableQ.A2_1 = (String) quest2_1.getSelectedItem();
				LableQ.A2_2 = (String) quest2_2.getSelectedItem();
				LableQ.A2_3 = (String) quest2_3.getSelectedItem();
				LableQ.A2_4 = (String) quest2_4.getSelectedItem();
				LableQ.A2_5 = (String) quest2_5.getSelectedItem();
				
				LableQ.A3_1 = (String) quest3_1.getSelectedItem();
				LableQ.A3_2 = (String) quest3_2.getSelectedItem();
				
				LableQ.A4_1 = (String) quest4_1.getSelectedItem();
				LableQ.A4_2 = (String) quest4_2.getSelectedItem();
				
				LableQ.A5_1 = (String) quest5_1.getSelectedItem();
				LableQ.A5_2 = (String) quest5_2.getSelectedItem();
				LableQ.A5_3 = (String) quest5_3.getSelectedItem();
				LableQ.A5_4 = (String) quest5_4.getSelectedItem();
				
				LableQ.A6 = (String) quest6.getText();
				LableQ.A7 = (String) quest7.getSelectedItem();
				LableQ.A8 = (String) quest8.getSelectedItem();
				LableQ.A9 = (String) quest9.getSelectedItem();
				LableQ.A10 = (String) quest10.getSelectedItem();
				
				
				
				if(quest1.getSelectedItem() == quest1.getItemAt(1)){
					LableQ.S1 = 3;
				}else if (quest1.getSelectedItem() == quest1.getItemAt(2)){
					LableQ.S1 = 2;
				}else if (quest1.getSelectedItem() == quest1.getItemAt(3)){
					LableQ.S1 = 1;
				} else{LableQ.S1 = 0;}
				
				if(quest2_1.getSelectedItem() == quest2_1.getItemAt(1)){
					LableQ.S2_1 = 3;
				}else if (quest2_1.getSelectedItem() == quest2_1.getItemAt(2)){
					LableQ.S2_1 = 2;
				}else if (quest2_1.getSelectedItem() == quest2_1.getItemAt(3)){
					LableQ.S2_1 = 1;
				} else{LableQ.S2_1 = 0;}
				
				if(quest2_2.getSelectedItem() == quest2_2.getItemAt(1)){
					LableQ.S2_2 = 3;
				}else if (quest2_2.getSelectedItem() == quest2_2.getItemAt(2)){
					LableQ.S2_2 = 2;
				}else if (quest2_2.getSelectedItem() == quest2_2.getItemAt(3)){
					LableQ.S2_2 = 1;
				} else{LableQ.S2_2 = 0;}
				
				if(quest2_3.getSelectedItem() == quest2_3.getItemAt(1)){
					LableQ.S2_3 = 3;
				}else if (quest2_3.getSelectedItem() == quest2_3.getItemAt(2)){
					LableQ.S2_3 = 2;
				}else if (quest2_3.getSelectedItem() == quest2_3.getItemAt(3)){
					LableQ.S2_3 = 1;
				} else{LableQ.S2_3 = 0;}
				
				if(quest2_4.getSelectedItem() == quest2_4.getItemAt(1)){
					LableQ.S2_4 = 3;
				}else if (quest2_4.getSelectedItem() == quest2_4.getItemAt(2)){
					LableQ.S2_4 = 2;
				}else if (quest2_4.getSelectedItem() == quest2_4.getItemAt(3)){
					LableQ.S2_4 = 1;
				} else{LableQ.S2_4 = 0;}
				
				if(quest2_5.getSelectedItem() == quest2_5.getItemAt(1)){
					LableQ.S2_5 = 3;
				}else if (quest2_5.getSelectedItem() == quest2_5.getItemAt(2)){
					LableQ.S2_5 = 2;
				}else if (quest2_5.getSelectedItem() == quest2_5.getItemAt(3)){
					LableQ.S2_5 = 1;
				} else{LableQ.S2_5 = 0;}
				
				if(quest3_1.getSelectedItem() == quest3_1.getItemAt(1)){
					LableQ.S3_1 = 3;
				}else if (quest3_1.getSelectedItem() == quest3_1.getItemAt(2)){
					LableQ.S3_1 = 2;
				}else if (quest3_1.getSelectedItem() == quest3_1.getItemAt(3)){
					LableQ.S3_1 = 1;
				} else{LableQ.S3_1 = 0;}
				
				if(quest3_2.getSelectedItem() == quest3_2.getItemAt(1)){
					LableQ.S3_2 = 3;
				}else if (quest3_2.getSelectedItem() == quest3_2.getItemAt(2)){
					LableQ.S3_2 = 2;
				}else if (quest3_2.getSelectedItem() == quest3_2.getItemAt(3)){
					LableQ.S3_2 = 1;
				} else{LableQ.S3_2 = 0;}
				
				if(quest4_1.getSelectedItem() == quest4_1.getItemAt(1)){
					LableQ.S4_1 = 3;
				}else if (quest4_1.getSelectedItem() == quest4_1.getItemAt(2)){
					LableQ.S4_1 = 2;
				}else if (quest4_1.getSelectedItem() == quest4_1.getItemAt(3)){
					LableQ.S4_1 = 1;
				} else{LableQ.S4_1 = 0;}
				
				if(quest4_2.getSelectedItem() == quest4_2.getItemAt(1)){
					LableQ.S4_2 = 3;
				}else if (quest4_2.getSelectedItem() == quest4_2.getItemAt(2)){
					LableQ.S4_2 = 2;
				}else if (quest4_2.getSelectedItem() == quest4_2.getItemAt(3)){
					LableQ.S4_2 = 1;
				} else{LableQ.S4_2 = 0;}
				
				if(quest5_1.getSelectedItem() == quest5_1.getItemAt(1)){
					LableQ.S5_1 = 3;
				}else if (quest5_1.getSelectedItem() == quest5_1.getItemAt(2)){
					LableQ.S5_1 = 2;
				}else if (quest5_1.getSelectedItem() == quest5_1.getItemAt(3)){
					LableQ.S5_1 = 1;
				} else{LableQ.S5_1 = 0;}
				
				if(quest5_2.getSelectedItem() == quest5_2.getItemAt(1)){
					LableQ.S5_2 = 3;
				}else if (quest5_2.getSelectedItem() == quest5_2.getItemAt(2)){
					LableQ.S5_2 = 2;
				}else if (quest5_2.getSelectedItem() == quest5_2.getItemAt(3)){
					LableQ.S5_2 = 1;
				} else{LableQ.S5_2 = 0;}
				
				if(quest5_3.getSelectedItem() == quest5_3.getItemAt(1)){
					LableQ.S5_3 = 3;
				}else if (quest5_3.getSelectedItem() == quest5_3.getItemAt(2)){
					LableQ.S5_3 = 2;
				}else if (quest5_3.getSelectedItem() == quest5_3.getItemAt(3)){
					LableQ.S5_3 = 1;
				} else{LableQ.S5_3 = 0;}
				
				if(quest5_4.getSelectedItem() == quest5_4.getItemAt(1)){
					LableQ.S5_4 = 3;
				}else if (quest5_4.getSelectedItem() == quest5_4.getItemAt(2)){
					LableQ.S5_4 = 2;
				}else if (quest5_4.getSelectedItem() == quest5_4.getItemAt(3)){
					LableQ.S5_4 = 1;
				} else{LableQ.S5_4 = 0;}
				
				
	
				if(quest6.getText().equals("24") ){
					LableQ.S6 = 2;
				}else{LableQ.S6 = 0;}
				
				if(quest7.getSelectedItem() == quest7.getItemAt(1)){
                                    LableQ.S7 = 1;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(2)){
                                    LableQ.S7 = 1;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(3)){
                                    LableQ.S7 = 1;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(4)){
                                    LableQ.S7 = 2;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(5)){
                                    LableQ.S7 = 2;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(6)){
                                    LableQ.S7 = 3;
                                }else if(quest7.getSelectedItem() == quest7.getItemAt(7)){
                                    LableQ.S7 = 3;
                                }
				
				if(quest8.getSelectedItem() == quest8.getItemAt(1)){
					LableQ.S8 = 3;
				}else if (quest8.getSelectedItem() == quest8.getItemAt(2)){
					LableQ.S8 = 2;
				}else if (quest8.getSelectedItem() == quest8.getItemAt(3)){
					LableQ.S8 = 1;
				} else{LableQ.S8 = 0;}
				
				if(quest9.getSelectedItem() == quest9.getItemAt(1)){
					LableQ.S9 = 3;
				}else if (quest9.getSelectedItem() == quest9.getItemAt(2)){
					LableQ.S9 = 2;
				}else if (quest9.getSelectedItem() == quest9.getItemAt(3)){
					LableQ.S9 = 1;
				} else{LableQ.S9 = 0;}
				
				if(quest10.getSelectedItem() == quest10.getItemAt(1)){
					LableQ.S10 = 3;
				}else if (quest10.getSelectedItem() == quest10.getItemAt(2)){
					LableQ.S10 = 2;
				}else if (quest10.getSelectedItem() == quest10.getItemAt(3)){
					LableQ.S10 = 1;
				} else{LableQ.S10 = 0;}
				
				LableQ.RESULT = LableQ.S1 + LableQ.S2_1+LableQ.S2_2+LableQ.S2_3+LableQ.S2_4+LableQ.S2_5+LableQ.S3_1+LableQ.S3_2+LableQ.S4_1
						+LableQ.S4_2+LableQ.S5_1+LableQ.S5_2+LableQ.S5_3+LableQ.S5_4+LableQ.S6+LableQ.S7+LableQ.S8+LableQ.S9+LableQ.S10;
				
				result.setText("Всего набрано баллов:"+LableQ.RESULT);
				System.out.println(LableQ.RESULT);
				System.out.println(LableQ.S6);
                                
				                 try{  
       
                                    Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlmspiv_bd?" + "user=root&password=root");     
       
                                    Statement st = (Statement) conn.createStatement();
                                    preparedStatement = conn.prepareStatement(UPDATE_NEW);
                                    
                                   
                                  
                                if(LableQ.RESULT < 17){
                                     
                                     preparedStatement.setInt(1, 1);
                                     preparedStatement.setString(2, LableQ.currentStudent);
                                     LableQ.levelDisStudent = "Миопия";
                                    
                                     
                                }else if(LableQ.RESULT > 18 && LableQ.RESULT < 35){
                                     
                                     preparedStatement.setInt(1, 2);
                                     preparedStatement.setString(2, LableQ.currentStudent);
                                     LableQ.levelDisStudent = "Гиперметропия";
                                     
                                }else if(LableQ.RESULT > 36){
                                     
                                     preparedStatement.setInt(1, 3);
                                     preparedStatement.setString(2, LableQ.currentStudent);
                                    LableQ.levelDisStudent = "Астигматизм";
                                     
                                }

                                     preparedStatement.execute();
       
       
                                    }
                                    catch(Exception e){
                                    e.printStackTrace();
                                    
                                    
       
   } 
                    JOptionPane.showMessageDialog( null, "Ваш уровень зрения: " + LableQ.levelDisStudent, "Уведомление", JOptionPane.DEFAULT_OPTION);                             
                    new NewJFrame3().setVisible(true);
                    j1.setVisible(false);
				
				
			}
		});
		
		result = new JLabel();
		JPanel comboPanel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(comboPanel);	
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setVisible(true);
		
		
        
		BoxLayout boxLayout = new BoxLayout(comboPanel, BoxLayout.Y_AXIS);
		
		
		
		comboPanel.setLayout(boxLayout);

		
		comboPanel.add(label1);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(quest1, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2_1);
		comboPanel.add(quest2_1, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2_2);
		comboPanel.add(quest2_2, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2_3);
		comboPanel.add(quest2_3, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2_4);
		comboPanel.add(quest2_4, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label2_5);
		comboPanel.add(quest2_5, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label3);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label3_1);
		comboPanel.add(quest3_1, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label3_2);
		comboPanel.add(quest3_2, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label4);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label4_1);
		comboPanel.add(quest4_1, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label4_2);
		comboPanel.add(quest4_2, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label5);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label5_1);
		comboPanel.add(quest5_1, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label5_2);
		comboPanel.add(quest5_2, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label5_3);
		comboPanel.add(quest5_3, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label5_4);
		comboPanel.add(quest5_4, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label6);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(thumb);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label6_1);
		comboPanel.add(quest6, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label7);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(quest7, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label8);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(quest8, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label9);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(thumb1);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(quest9, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(label10);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(quest10, BorderLayout.NORTH);
		comboPanel.add(Box.createRigidArea(new Dimension(0,10)));
		comboPanel.add(button, BorderLayout.NORTH);
		comboPanel.add(result);
		
		
		
		

		
		
		

		

		
		
		//add(comboPanel, BorderLayout.NORTH);
		j1.getContentPane().add(scrollPane);


		
		
		
		
		
	}
    
}
