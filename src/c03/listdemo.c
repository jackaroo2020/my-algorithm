#include <stdio.h>

#define MAX 10
struct SList{
	int data[MAX];
	int length;
};

void init(struct SList* p){
	p->length = 0;
}

void printList(const struct SList* p){
	int i=0;
	for(i; i<p->length; i++){
		printf("%d ",p->data[i]);
	}
	putchar('\n');
}

int insert(struct SList* p, int k, int x){
	//  length -1 length
	if (k<0 || k>p->length || p->length == MAX){
		return 0;
	}
	else {
		int i=p->length-1;
		for(i; i>=k; i--){
			p->data[i+1] = p->data[i];
		}
		p->data[k] = x;
		p->length++;
		return 1;
	}

}

int delete(struct SList* p, int k, int* px){
	if (k<0 || k >= p->length) {
		return 0;
	} else {
		*px = p->data[k];
		int i = k +1;
		for (i; i<p->length;i++) {
			p->data[i-1] = p->data[i];
		}
		p->length--;
		return 1;
	}
}
int main(){
	struct SList a;
	// 初始化
	init(&a);
	//  打印
	printList(&a);
	// 插入
	insert(&a,0,11);
	insert(&a,0,22);
	insert(&a,1,33);
	printList(&a);
	// 删除
	int x;
	delete(&a,1,&x);
	delete(&a,1,&x);
	printList(&a);
	return 0;
}