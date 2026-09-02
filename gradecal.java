class gradecal 
{
    public static void main(String[] args) 
	{
        int totalMarks = 456;
        int subjects    = 5;

        int wrongAvg = totalMarks / subjects;
        System.out.println("Wrong avg: " + wrongAvg);  

        double correctAverage = (double) totalMarks / subjects;
        System.out.println("Correct avg: " + correctAverage);

        int displayAvg = (int) correctAverage;
        System.out.println("Display avg: " + displayAvg); 
    }
}