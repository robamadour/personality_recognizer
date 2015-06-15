package recognizer;

public class General {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalityRecognizer pr = new PersonalityRecognizer();
		pr.main(args);
		
		for (int i = 0; i<args.length; i++){
			System.out.println(args[i]);
		}
		

	}
	
	public Double[] getTotalScores(String path, String [] args, PersonalityRecognizer pr){
		Double[] scores = new Double[5];
		args[1] = path;
		pr.main(args);		
		
		return scores;
	}

}
