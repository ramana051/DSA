class stack:
    def __init__(self,size):
        self.stack=[]
        self.size=size
        self.stack=[0]*size
        self.top=-1
        print('stack created -> ',self.stack)
    def push(self,data):
        if self.top==self.size-1:
            print('stack overflow')
            return
        self.top+=1
        self.stack[self.top]=data
        return print('after push',data,'-> ',self.stack)
    def pop(self):
        if self.top==-1:
            print('stack underflow')
            return
        self.stack.pop(self.top)
        self.top-=1
        return print('after pop -> ',self.stack)
    def peek(self):
        return print(self.stack[self.top])
s=stack(5)
s.push(1)
s.push(2)
s.push(3)
s.push(4)
s.push(5)
s.push(5)
s.pop()
s.pop()
s.peek()