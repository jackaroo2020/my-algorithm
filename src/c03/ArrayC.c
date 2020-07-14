#include <stdio.h>

#define OK 1
#define ERROR 0
#define TRUE 1
#define FLASE 0
typedef int Status;

#define MAXSIZE 20  /*存储空间初始分配量*/
typedef int ElemType; /*ElemType 类型根据实际情况而定，这里假设为int*/
typedef struct
{
	ElemType data[MAXSIZE]; /* 数据存储数据元素，最大值为MAXSIZE*/
	int length; /*线性表当前长度*/
}SqList;

/**
初始化操作
**/
void init(SqList *L){
	L->length = 0;
}

/**
打印操作
**/
void printList(const SqList *L){
	int i=0;
	for(i; i<L->length; i++){
		printf("%d ",L->data[i]);
	}
	putchar('\n');
}

/**
获取元素操作
只要i的数值在数组下标范围内，就是把数组第i-1小标的值返回即可。
**/
Status GetElem(SqList L, int i, ElemType *e)
{
	if (L.length ==0 || i < 1 || i > L.length) {
		return ERROR;
	}
	*e = L.data[i-1];
	return OK;
}


/**
插入操作
1) 如果插入位置不合理，跑出异常
2) 如果线性表长度大于等于数组长度，则抛出异常或动态增加容量
3) 从最后一个元素开始向前遍历到第i个位置，分别将它们都向后移动一个位置；
4）将要插入的元素填入位置i处
5）表长加 1
**/
Status ListInsert(SqList *L,int i, ElemType e)
{
	int k;
    /**顺序线性表已经满**/
	if (L->length == MAXSIZE)
	{
		return ERROR;
	}
	/**当i不在顺序线性表中**/
	if (i < 1 || i > L->length+1)
	{
		return ERROR;
	}
	if (i <= L->length)
	{
		for (k = L->length-1; k>i-1; k--)
		{
			L->data[k+1] = L->data[k];
		}

	}
	L->data[i-1] = e;
	L->length++;
	return OK;
 }


/**
删除操作
1) 如果删除位置不合理，跑出异常
2) 取出删除元素
3) 从删除元素开始向后遍历到第最后一个位置，分别将它们都向前移动一个位置；
4）将要插入的元素填入位置i处
5）表长减 1
**/
Status ListDelete(SqList *L,int i, ElemType *e)
{
	int k;
	if (L->length==0)
	{
		return ERROR;
	}
	if (i<1 || i>L->length)
	{
		return ERROR;
	}

	*e = L->data[i-1];

	for (k; k< L->length;k++)
	{
		L->data[i-1] = L->data[i];

	 }

	 L->length--;
	 return OK;
}


int main(){
   SqList a;
	/**初始化**/
	init(&a);
	printList(&a);
	/**插入**/
	ListInsert(&a,1,123);
	ListInsert(&a,1,1234);
	ListInsert(&a,2,334);
	printList(&a);
	/**删除**/
//	int x;
//	ListDelete(&a,1,&x);
//	printList(&a);
//	return 0;
}






















