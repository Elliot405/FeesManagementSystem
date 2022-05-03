package com.company;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private  int feesTotal;
    public Student(int id, String name, int grade)
    {
        this.feesPaid=0;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public int getId() {
        return id;
    }
    public void getGrade(int grade) {
        this.grade=grade;
    }
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees()
    {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Students name: "+ name+ "Total fees paid so far "+ feesPaid;
         }
}
