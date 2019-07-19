import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q71 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. An exception is thrown at runtime.
		 * B. 07-31-2014
		 * C. 2014-07-31
		 * D. 2014-09-30
		 */
		
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		
		dt.plusDays(30);
		dt.plusMonths(1);
		// 논리상으로는 값을 올리는 것이 맞지만 변수 값에 저장을 한 것은 아님
		// 따라서, 동일한 값으로 출력되는 것이 맞음
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		
		// Answer : C
	}

}
