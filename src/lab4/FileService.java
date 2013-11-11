package lab4;

public class FileService {
    
    public void getInput(FileInputStrategy inputStrategy) {
        inputStrategy.readInput();
    }

    public void setOutput(FileOutputStrategy outputStrategy){
        outputStrategy.writeOutput();      
    }
    
}