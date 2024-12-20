package codingTest;
import java.util.Scanner;


public class CT24_11_28 {
//	3
//	2
//	1
//	Let's go! 출력하기
	public void lv0_1() {

	    String message = "Let's go!";
	
	    System.out.println("3 \n 2 \n 1"); /*\n 추가해서 해결*/
	    System.out.println(message);
	}
	
//	일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현합니다. 따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미합니다. 예를 들면, 30도와 390도는 같은 각도입니다.
//	주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때, 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
	public void lv0_2() {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        /*angle1-=360; angle2-=360; 해당 코드 추가해서 해결인 줄 알았는데 아니었다;;*/ 
        int sum_angle = angle1 + angle2; sum_angle = sum_angle % 360; /*sum_angle = sum_angle % 360;을 추가하는게 정답... %를 더 공부해야겠음*/
        //int sum_angle = angle1 + angle2;
        System.out.println(sum_angle);
	}
		
	//2자리 이상의 정수 number가 주어집니다. 주어진 코드는 이 수를 2자리씩 자른 뒤, 자른 수를 모두 더해서 그 합을 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
	public void lv0_3() {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<number; i++){ /*i<1; 로 되어있는 것을 i<number;로 변경해서 해결*/
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
	}
	
//	퓨쳐종합병원에서는 접수한 환자가 진료받을 병과에 따라 자동으로 환자 코드를 부여해 주는 프로그램이 있습니다. 환자 코드의 마지막 네 글자를 보면 환자가 어디 병과에서 진료를 받아야 할지 알 수 있습니다. 예를 들어 환자의 코드가 "_eye"로 끝난다면 안과를, "head"로 끝난다면 신경외과 진료를 보게 됩니다. 환자 코드의 마지막 글자에 따른 병과 분류 기준은 다음과 같습니다.
//	마지막 글자	병과
//	"_eye"	"Ophthalmologyc"
//	"head"	"Neurosurgery"
//	"infl"	"Orthopedics"
//	"skin"	"Dermatology"
//	환자의 코드를 나타내는 문자열 code를 입력받아 위 표에 맞는 병과를 출력하도록 빈칸을 채워 코드를 완성해 주세요. 위 표의 단어로 끝나지 않는다면 "direct recommendation"를 출력합니다.
	public void lv0_4() {
		Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){		/*"_eye" 추가*/
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")){ 	/*lastFourWords.equals("head") 추가*/
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals("infl")){ 	/*lastFourWords.equals("infl") 추가*/
            System.out.println("Orthopedics");
        }
        else if(lastFourWords.equals("skin"))	
        {
            System.out.println("Dermatology");	/*else if(lastFourWords.equals("skin")) 추가*/
        }
        
        else{									/*else 추가*/
            System.out.println("direct recommendation");
        }
		
	}
		 

}
