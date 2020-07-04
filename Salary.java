public class Salary {
    public static void main(String[] args) {
        int m_salary = 900;
        
        int tax = (m_salary * 9)/100;
        
        int c_salary = m_salary - tax;
        
        int year_salary = c_salary * 12;
        
        int gov = tax * 12;
    
        System.out.println("Year salary is: " + year_salary);
        System.out.println("Government tax is: " + gov);
        
    }
    
}