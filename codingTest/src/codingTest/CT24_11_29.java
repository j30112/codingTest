package codingTest;

public class CT24_11_29 {
//	심폐소생술은 다음과 같은 순서를 통해 실시합니다.
//	심정지 및 무호흡 확인 [check]
//	도움 및 119 신고 요청 [call]
//	가슴압박 30회 시행 [pressure]
//	인공호흡 2회 시행 [respiration]
//	가슴압박, 인공호흡 반복 [repeat]
//	주어진 solution 함수는 심폐소생술을 하는 방법의 순서가 담긴 
//	문자열들이 무작위 순서로 담긴 리스트 cpr이 주어질 때 각각의 방법이 몇 번째 단계인지 순서대로 담아 
//	return하는 함수입니다. solution 함수가 올바르게 작동하도록 빈칸을 채워 solution 함수를 완성해 주세요.
	public void lv0_5() {
		class Solution {
		    public int[] solution(String[] cpr) {
		        int[] answer = {0, 0, 0, 0, 0};
		        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

		        for(int i=0; i<cpr.length; i++){  				/*cpr.length  추가*/
		            for(int j=0; j<basic_order .length; j++){	/*basic_order .length 추가*/
		                if(cpr[i].equals(basic_order[j])){
		                    answer[i] = j+1;					/*j+1 추가 (계속 -1 값만 나오는걸 지금 눈치챘다;; 배열이 0이었잖어)*/
		                    break;
		                }
		            }
		        }
		        return answer;
		    }
		}
	}
	
//	ㅇㅇ시에서는 저수지가 하나 있는데, 도시 내에서 사용하는 모든 물은 이 저수지에 저장된 물을 끌어와 사용합니다. 
//	이상 기후로 인해 극심한 가뭄이 예고된 상황에서, 지난 달의 물 사용량과 이번달부터 일정 기간 동안의 월별 물 사용량의 변화를 
//	예측한 값을 이용해 몇 달 뒤 물이 부족해지는지 예측하려고 합니다.
//	이번달부터의 월별 물 사용량 변화를 예측한 값은 다음과 같이 리스트에 담겨 주어집니다.
//	[10, -10, 10, -10, 10, -10, 10, -10, 10, -10]
//	리스트의 각 원소는 해당 월의 물 사용량이 전 달에 비해 몇 % 만큼 증가 또는 감소하는지를 나타냅니다.
//	예를 들어, 이번달의 물 사용량 (리스트의 첫 번째 원소)은 지난 달 보다 10% 증가한 값이며, 다음 달(리스트의 두 번째 원소)의 물 사용량은 이번달 사용량에서 10%만큼 감소한 값입니다.
//	자세한 값은 입출력 예시를 참고해 주세요.
//	현재 저수지에 저장된 물의 양을 나타내는 정수 storage와 지난 달 물 사용량을 나타내는 정수 usage, 월별 물 사용량이 전 달 대비 어떻게 변하는지 
//	저장된 정수 리스트 change가 주어질 때 몇 달 뒤 물이 부족해지는지 return 하도록 solution 함수를 작성하려 합니다. 코드가 올바르게 작동하도록 한 줄을 
//			수정해 solution 함수를 완성해 주세요. 가뭄이 끝날때 까지 저수지의 물이 남아 있다면 -1을 return합니다.
	public void lv0_6() {
		class Solution {
		    public int solution(int storage, int usage, int[] change) {
		        int total_usage = 0;
		        for(int i=0; i<change.length; i++){
		            usage += usage * change[i] / 100; /*usage = total_usage * change[i] / 100; 이거 수정함 개인적으로 제일 어려웠음.. 다른사람 풀이보고 풀음*/
		            /*  = 연산: usage 값을 갱신 (기존 값을 대체) 얘는 값을 대체하는거고
		             * += 연산: usage 값을 누적 (기존 값에 계산 결과 추가) 얘는 비율만큼 더해주는 거였구나 하....*/
		            total_usage += usage;
		            if(total_usage > storage){
		                return i;
		            }
		        }
		        return -1;
		    }
		}
	}
	
	
	
}
