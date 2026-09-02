class control 
{
    public static void main(String[] args) 
    {
        int marks=70,n=5,sum=0,day=1;
        // if-else Statement
        if (marks >= 60) 
            {
            System.out.println("Pass");
        } 
        else if (marks >= 35) {
            System.out.println("Compartment");
        } 
        else 
        {
            System.out.println("Fail");
        }

        // switch case Statement
        switch (day) 
        {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            default:
                 System.out.println("Other");
        }

        // for loop
        for (int i = 0; i < 5; i++) 
        { 
            System.out.print(i + " "); 
        }

        // while
        while (n > 0) 
        {
            sum += n % 10; 
            n /= 10; 
        }

        // do-while (executes at least once)
        do 
        { 
            System.out.println("Entered"); 
        } 
        while (false);
            }
}
