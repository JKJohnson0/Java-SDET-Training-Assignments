package hackerRankQuestions;

public class ApiCall {

	
	@GetMapping ( value = "api/countries?name=Afghanistan")
	 public static String getCapitalCity(String country) {
	 
	 return repository.findbyID(country);

}
