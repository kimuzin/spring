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
	
	// 큐 배열은 front와 rear 그리고 maxSize를 가진다.
    private int front;
    private int rear;
    private int maxSize;
    private static Object[] queueArray;
    
    // 큐 배열 생성
    public QueueTest(int maxSize){
        
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        queueArray = new Object[maxSize];
    }
    
    // 큐가 비어있는지 확인
    public boolean empty(){
        return (front == rear+1);
    }
    
    // 큐가 꽉 찼는지 확인
    public boolean full(){
        return (rear == maxSize-1);
    }
    
    // 큐 rear에 데이터 등록
    public void insert(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException();
        
        queueArray[++rear] = item;
    }
    
    // 큐에서 front 데이터 조회
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return queueArray[front];
    }
    
    // 큐에서 front 데이터 제거
    public Object remove(){
        
        Object item = peek();
        front++;
        return item;
    }


}
