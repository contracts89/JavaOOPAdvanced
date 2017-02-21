package Problem03DependencyInversion;

public class PrimitiveCalculator {

    private boolean isAddition;
    private boolean isMultiplying;
    private boolean isSubstracting;
    private boolean isFirstCalculation;
    private AdditionStrategy additionStrategy;
    private SubtractionStrategy subtractionStrategy;
    private MultiplyingStrategy multiplyingStrategy;
    private DividingStrategy dividingStrategy;

    public PrimitiveCalculator(){
        this.additionStrategy = new AdditionStrategy();
        this.subtractionStrategy = new SubtractionStrategy();
        this.dividingStrategy = new DividingStrategy();
        this.multiplyingStrategy = new MultiplyingStrategy();
        this.isAddition = true;
        this.isFirstCalculation = getIsFirstCalculation();
    }

    public void changeStrategy(char operator){
        switch (operator){
            case '+': this.isAddition = true;
                this.isMultiplying = false;
                this.isSubstracting = false;
                break;
            case '-':this.isAddition = false;
            this.isMultiplying = false;
            this.isSubstracting = true;
                break;
            case '*': this.isMultiplying = true;
                this.isAddition = false;
                this.isSubstracting = false;
            break;
            case '/': this.isMultiplying = false;
                this.isAddition = false;
                this.isSubstracting = false;
            break;
        }
    }

    public int performCalculation(int firstOperand,int secondOperand){
        if(this.isAddition){
            return this.additionStrategy.Calculate(firstOperand,secondOperand);
        }else if(this.isMultiplying){
            return this.multiplyingStrategy.Calculate(firstOperand, secondOperand);
        }else if(!this.isMultiplying && !this.isAddition && !this.isSubstracting){
            return this.dividingStrategy.Calculate(firstOperand, secondOperand);
        }
        else{
            return this.subtractionStrategy.Calculate(firstOperand,secondOperand);
        }
    }

    public void setFirstCalculation(boolean firstCalculation) {
        isFirstCalculation = firstCalculation;
    }

    public boolean getIsFirstCalculation(){
        return this.isFirstCalculation;
    }
}
