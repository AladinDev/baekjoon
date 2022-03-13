import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(br.readLine());

		for (int z = 0; z < c; z++) {
			String line[] = br.readLine().split(" ");
			double n = Double.parseDouble(line[0]);

			double avg = 0;
			for (int i = 1; i < line.length; i++) {
				avg += Double.parseDouble(line[i]);
			}
			avg = avg / n;
			

			int pNum = 0;
			for (int j = 1; j < line.length; j++) {
				if (Double.parseDouble(line[j]) > avg) {
					pNum++;
				}
			}
			System.out.println( String.format("%.3f", pNum / n * 100)  + "%");
		}
	}
}
