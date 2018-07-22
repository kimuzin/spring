package test.controller;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		new QueueTest(5);
		System.out.println("@@@==="+queueArray.length);
		queueArray[0] = "test1";
		queueArray[1] = "test1";
		
		Queue que = new LinkedList();
		que.add("1111111111");
		que.add("222222");
		que.add("3333");
		que.add("4444");
		
		System.out.println("queue ##");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
	}
	
	// ť �迭�� front�� rear �׸��� maxSize�� ������.
    private int front;
    private int rear;
    private int maxSize;
    private static Object[] queueArray;
    
    // ť �迭 ����
    public QueueTest(int maxSize){
        
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        queueArray = new Object[maxSize];
    }
    
    // ť�� ����ִ��� Ȯ��
    public boolean empty(){
        return (front == rear+1);
    }
    
    // ť�� �� á���� Ȯ��
    public boolean full(){
        return (rear == maxSize-1);
    }
    
    // ť rear�� ������ ���
    public void insert(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException();
        
        queueArray[++rear] = item;
    }
    
    // ť���� front ������ ��ȸ
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return queueArray[front];
    }
    
    // ť���� front ������ ����
    public Object remove(){
        
        Object item = peek();
        front++;
        return item;
    }


}
