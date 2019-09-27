package chapter_3;

import java.util.EmptyStackException;

public class ctci_3_1 {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int values[];
    private int sizes[];
    
    public void FixedSizeStack(int stackSize){
        stackCapacity = stackSize;
        values = new int[numberOfStacks*stackSize];
        sizes = new int[stackSize];
    }
    
    public void pushStackElement(int stackNumber,int value) throws Exception{
        if(isFull(stackNumber)){
            throw new Exception();
        }
        values[indexOfTop(stackNumber)] = value;
        sizes[stackNumber]++;
    }
    
    public boolean isFull(int stackNumber){
        return (sizes[stackNumber] == stackCapacity);
    }
    
    public int popStackElement(int stackNumber){
        if(isEmpty(stackNumber)){
            throw new EmptyStackException();
        }
        
        int topIndex = indexOfTop(stackNumber);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNumber]--;
        return  value;
    }
    
    public int peekStackElement(int stackNumber){
        if(isEmpty(stackNumber)){
            throw new EmptyStackException();
        }
        
        return values[indexOfTop(stackNumber)];
    }
    
    private boolean isEmpty(int stackNumber) {
		// TODO
		return false;
	}

	private int indexOfTop(int stackNumber){
        int offset = stackNumber*stackCapacity;
        int size = sizes[stackNumber];
        return offset + size - 1;
    }
}