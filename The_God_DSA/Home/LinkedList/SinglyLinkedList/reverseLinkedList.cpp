#include<iostream>
using namespace std;

ListNode* reverseList(ListNode* head) {
      vector<int> ans;
      ListNode*  temp = head;
        while(temp != NULL){
            ans.push_back(temp->val);
            temp = temp->next;
        };
       
        int i = ans.size() - 1;
        temp = head;
        while(temp != NULL){
            temp->val = ans[i];
            i--;
            temp = temp->next;
        };
        return head;
}


ListNode* reverseList2(ListNode* head) {
      ListNode *curr = head, *prev = NULL, *fut = NULL;

        while(curr != NULL){
            fut = curr->next;
            curr->next = prev;
            prev = curr;
            curr = fut;
        };
        head = prev;
        return head;
}


int main() {



    return 0;
}