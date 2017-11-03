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
 
 final int SIZE = 5; //빙고판의 크기
 int bingoCnt = 0;   //완성된 라인의 수
 
 private Button [] btnArr = null;
 private boolean [][]bArr = new boolean[SIZE][SIZE];//빙고판 체크여부를 확인을 위한 배열
 private String[] values = {
   "송성식","김형선","이주엽","강용운","이대엽",
   "김지훈","문승도","서종현","김한주","홍정우",
   "주한나","이성민","유창근","고병욱","변윤서",
   "이정현","전지현","송혜교","아즘마","김사랑",
   "최윤호","최병걸","문승명","장천호","임재환"
   };
 public BingoEx(){
  this("Bingo Game Ver1.0");//아래 하위 파라메터 생성자 호출
 }
 
 public BingoEx(String title){
  super(title);//Frame 클래스 생성자 호출
  
  this.setLayout(new GridLayout(SIZE , SIZE));//awt 가로세로 5개식 생성
  
  MyEventHandler handler = new MyEventHandler();
  this.addWindowListener(handler);
  
  btnArr = new Button[SIZE*SIZE];
  
  this.shuffle();//값을 무작위로 섞는다
  
  //Frame에 버튼을 추가한다
  for(int i = 0; i < SIZE*SIZE; i++){
   btnArr[i] = new Button(this.values[i]);
   this.add(btnArr[i]);
   btnArr[i].addActionListener(handler);
  }
  
   setBounds(500,200,300,300);
   setVisible(true); //visble true or false
 }
 
 /**
  * 배열의 값을 난수로 섞는다 중복된값 반드시 제외..
  * 
  */
 private void shuffle() {
  // 반복문을 사용해서 문자열 배열 values 의 각 요소의 위치를 뒤바꾼다.
  
  for(int i = 0; i < values.length * 2; i++){
   int r1 = (int)(Math.random() * values.length);//0~24
   int r2 = (int)(Math.random() * values.length);//0~24
   //스와핑 로직삽입
   String tmp = values[r1];
   values[r1] = values[r2];
   values[r2] = tmp;
  }
 }
 public void print(){//배열 bArr을 출력한다
  for(int i = 0; i < bArr.length; i++){
   for(int j=0; j < bArr[i].length; j++){
    System.out.print(bArr[i][j]?"O":"X");//true 같다면 O 아니면 X 출력
   }
   System.out.println();
  }
  System.out.println("----------------------------------");
  //System.out.println(this.bingoCnt);
 }
 
 boolean checkBingo(){
  this.bingoCnt = 0;//완성된 라인의 수
  int garoCnt = 0; //가로
  int seroCnt = 0; //세로
  int crossCnt1 = 0; //대각선
  int corssCnt2 = 0; //역대각선
  for(int i = 0; i <  bArr.length; i++){
   for(int j = 0; j < bArr[i].length; j++){//가로검사
     if(bArr[i][j] == true){
      garoCnt++;
      if(garoCnt == SIZE){//2차 배열을 1차 배열 형식으로 만들어야 한다 begin과 end를 이용하여 만든다
       int begin = i * SIZE ;
       int end = begin + SIZE ;
       for(int n = begin; n < end; n++) btnArr[n].setBackground(Color.green);
      }
     }
     if(bArr[j][i]==true){//세로검사
      seroCnt++;
      if(seroCnt == SIZE){
       for(int n = i; n < btnArr.length; n=n+5){//5식증가하여 색상 변경
        btnArr[n].setBackground(Color.green);
       }
      }
     }
     if( i==j && bArr[i][j]==true){//대각선검사
       crossCnt1++;
       if(crossCnt1 == SIZE){
        for(int n = 0; n < btnArr.length; n = n+6){//대각선으로 0부터 24까지 6식증가하여 색상변경
         btnArr[n].setBackground(Color.green);
        }
       }
     }
     if( ((bArr.length - 1)-i) == j  && bArr[i][j]==true){//역대각선 검사
      corssCnt2++;
      if(corssCnt2 == SIZE){
       /*for(int n = 4; n < btnArr.length; n = n+4){                 //case1
        btnArr[n].setBackground(Color.green);
        System.out.println(n);
       }*/
       for(int n = (btnArr.length-4); n > 0; n--){//포문을 역으로 돌려서 검사
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
   if(crossCnt1 == SIZE) bingoCnt++;//대각선과 역대각선은 1번식만 검사해주면된다
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
  public void actionPerformed(ActionEvent ae) {//버튼 클릭스 actionPerformed 메서드 오버라이딩 하여 Event 핸들링
   
   // TODO Auto-generated method stub
   Button btn = (Button)ae.getSource();            
   System.out.println(btn.getLabel());
   for(int i = 0; i < btnArr.length; i++){//버튼배열과 현제 눌려진 버튼 이벤트의 객체가 같은게 있다면..
    if(btnArr[i] == btn){
     //System.out.println((i/SIZE) + " 행"  + (i%SIZE) + " 열");
     if(bArr[i/SIZE][i%SIZE] == true){
      System.out.println("이미 누른 버튼입니다");
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
