import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
/**
 * Java BingoGame
 * @author Youzang
 */
public class BingoEx extends Frame {
 
 final int SIZE = 5; //�������� ũ��
 int bingoCnt = 0;   //�ϼ��� ������ ��
 
 private Button [] btnArr = null;
 private boolean [][]bArr = new boolean[SIZE][SIZE];//������ üũ���θ� Ȯ���� ���� �迭
 private String[] values = {
   "�ۼ���","������","���ֿ�","�����","�̴뿱",
   "������","���µ�","������","������","ȫ����",
   "���ѳ�","�̼���","��â��","����","������",
   "������","������","������","����","����",
   "����ȣ","�ֺ���","���¸�","��õȣ","����ȯ"
   };
 public BingoEx(){
  this("Bingo Game Ver1.0");//�Ʒ� ���� �Ķ���� ������ ȣ��
 }
 
 public BingoEx(String title){
  super(title);//Frame Ŭ���� ������ ȣ��
  
  this.setLayout(new GridLayout(SIZE , SIZE));//awt ���μ��� 5���� ����
  
  MyEventHandler handler = new MyEventHandler();
  this.addWindowListener(handler);
  
  btnArr = new Button[SIZE*SIZE];
  
  this.shuffle();//���� �������� ���´�
  
  //Frame�� ��ư�� �߰��Ѵ�
  for(int i = 0; i < SIZE*SIZE; i++){
   btnArr[i] = new Button(this.values[i]);
   this.add(btnArr[i]);
   btnArr[i].addActionListener(handler);
  }
  
   setBounds(500,200,300,300);
   setVisible(true); //visble true or false
 }
 
 /**
  * �迭�� ���� ������ ���´� �ߺ��Ȱ� �ݵ�� ����..
  * 
  */
 private void shuffle() {
  // �ݺ����� ����ؼ� ���ڿ� �迭 values �� �� ����� ��ġ�� �ڹٲ۴�.
  
  for(int i = 0; i < values.length * 2; i++){
   int r1 = (int)(Math.random() * values.length);//0~24
   int r2 = (int)(Math.random() * values.length);//0~24
   //������ ��������
   String tmp = values[r1];
   values[r1] = values[r2];
   values[r2] = tmp;
  }
 }
 public void print(){//�迭 bArr�� ����Ѵ�
  for(int i = 0; i < bArr.length; i++){
   for(int j=0; j < bArr[i].length; j++){
    System.out.print(bArr[i][j]?"O":"X");//true ���ٸ� O �ƴϸ� X ���
   }
   System.out.println();
  }
  System.out.println("----------------------------------");
  //System.out.println(this.bingoCnt);
 }
 
 boolean checkBingo(){
  this.bingoCnt = 0;//�ϼ��� ������ ��
  int garoCnt = 0; //����
  int seroCnt = 0; //����
  int crossCnt1 = 0; //�밢��
  int corssCnt2 = 0; //���밢��
  for(int i = 0; i <  bArr.length; i++){
   for(int j = 0; j < bArr[i].length; j++){//���ΰ˻�
     if(bArr[i][j] == true){
      garoCnt++;
      if(garoCnt == SIZE){//2�� �迭�� 1�� �迭 �������� ������ �Ѵ� begin�� end�� �̿��Ͽ� �����
       int begin = i * SIZE ;
       int end = begin + SIZE ;
       for(int n = begin; n < end; n++) btnArr[n].setBackground(Color.green);
      }
     }
     if(bArr[j][i]==true){//���ΰ˻�
      seroCnt++;
      if(seroCnt == SIZE){
       for(int n = i; n < btnArr.length; n=n+5){//5�������Ͽ� ���� ����
        btnArr[n].setBackground(Color.green);
       }
      }
     }
     if( i==j && bArr[i][j]==true){//�밢���˻�
       crossCnt1++;
       if(crossCnt1 == SIZE){
        for(int n = 0; n < btnArr.length; n = n+6){//�밢������ 0���� 24���� 6�������Ͽ� ���󺯰�
         btnArr[n].setBackground(Color.green);
        }
       }
     }
     if( ((bArr.length - 1)-i) == j  && bArr[i][j]==true){//���밢�� �˻�
      corssCnt2++;
      if(corssCnt2 == SIZE){
       /*for(int n = 4; n < btnArr.length; n = n+4){                 //case1
        btnArr[n].setBackground(Color.green);
        System.out.println(n);
       }*/
       for(int n = (btnArr.length-4); n > 0; n--){//������ ������ ������ �˻�
        if(n % 4 ==0)btnArr[n].setBackground(Color.green); //case2
       }
      }
     }
   }
   if(garoCnt == SIZE) bingoCnt++;
   if(seroCnt == SIZE) bingoCnt++;
   garoCnt = 0;
   seroCnt = 0;
  }
   if(crossCnt1 == SIZE) bingoCnt++;//�밢���� ���밢���� 1���ĸ� �˻����ָ�ȴ�
   if(corssCnt2 == SIZE) bingoCnt++; 
  
   //btnArr[1].setBackground(Color.GREEN);
  return bingoCnt >= SIZE;
 }
 
 public static void main(String[]args){
  BingoEx win = new BingoEx("Bingo Game Ver1.0");
  win.show();
  //win.print();
  //win.checkBingo();
 }
 
 
 class MyEventHandler extends WindowAdapter implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent ae) {//��ư Ŭ���� actionPerformed �޼��� �������̵� �Ͽ� Event �ڵ鸵
   
   // TODO Auto-generated method stub
   Button btn = (Button)ae.getSource();            
   System.out.println(btn.getLabel());
   for(int i = 0; i < btnArr.length; i++){//��ư�迭�� ���� ������ ��ư �̺�Ʈ�� ��ü�� ������ �ִٸ�..
    if(btnArr[i] == btn){
     //System.out.println((i/SIZE) + " ��"  + (i%SIZE) + " ��");
     if(bArr[i/SIZE][i%SIZE] == true){
      System.out.println("�̹� ���� ��ư�Դϴ�");
     }else{
      bArr[i/SIZE][i%SIZE] = true;
     }
     btnArr[i].setBackground(Color.YELLOW);
     break;
    }
   }
   print();
   if(checkBingo() == true){
    System.out.println("Bingo~~!");
   }
  }
  
  @Override
  public void windowClosing(WindowEvent e) {
   // TODO Auto-generated method stub
   e.getWindow().setVisible(false);
   e.getWindow().dispose();
   System.exit(-1);
  }
 }
 
}
