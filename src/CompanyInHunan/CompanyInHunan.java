package CompanyInHunan;

import java.util.*;
import java.io.*;

/*상근이는 세계적인 소프트웨어 회사 기글에서 일한다. 이 회사의 가장 큰 특징은 자유로운 출퇴근 시간이다. 따라서, 직원들은 반드시 9시부터 6시까지 회사에 있지 않아도 된다.

각 직원은 자기가 원할 때 출근할 수 있고, 아무때나 퇴근할 수 있다.

상근이는 모든 사람의 출입카드 시스템의 로그를 가지고 있다. 이 로그는 어떤 사람이 회사에 들어왔는지, 나갔는지가 기록되어져 있다. 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.*/

public class CompanyInHunan {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int Num = Integer.parseInt(bf.readLine());
		
		//hashMap함수는 탐색 알고리즘이 필요할 시 배열을 사용하는 것보다 좋다 때문에 앞으로 문자열등의 탐색이 필요할 결우 HashMap을 사용해야함
		//HashSet을 선언 HashSet을 사용한 이유는 이름만 저장하면 되기 때문에 쌍으로 저장하는 HashMap이 필요 없었따.
		Set<String> currentlyPresent = new HashSet<>();
		
		
		// 문자열이 leave가 아닐걍우 저장한다 숫자가 기하급수적으로 늘어날 수록 시간이 오래 걸리기 때문에 비교르 최소화 하는 것이 좋다
		for(int i = 0; i < Num; i++) {
			st = new StringTokenizer(bf.readLine());
			String a = st.nextToken();
			String s = st.nextToken();
			if(s.equals("enter")) {
				currentlyPresent.add(a);
			}else {
				currentlyPresent.remove(a);
			}
			
		}
		
		//new ArrayList<>(currentlyPresent)을 사용하여 초기 값을 지정한 채로 생성하였따.
		ArrayList<String> presentList = new ArrayList<>(currentlyPresent);

		// 역순 정렬
		Collections.sort(presentList, Collections.reverseOrder());

        for (String s : presentList) {
            System.out.println(s);
        }
	}

}
