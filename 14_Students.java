// Author - Himank Jeshwar
// Written - 9/8/21

// 56% left school in 2019 and 1/4 of the remaining left in 2020.If 
// the strength of the school was 400,how much students are left now ?
class Students
{
    public static void main(String[] args) 
    {
        //declaring..
        int totalStudents=400;
        //calculating..
        double l1=0.65*totalStudents;
        double rm_after_l1=totalStudents-l1;
        double l2=1/4*rm_after_l1;
        double remaining=rm_after_l1-l2;
        //answer
        System.out.print("Remaining Students = "+remaining);   
    }
}