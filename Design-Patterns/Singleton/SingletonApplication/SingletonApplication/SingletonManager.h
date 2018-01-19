#pragma once
#include <iostream>

class SingletonManager
{

private: 
	static SingletonManager* SingletonManagerInstance;
	SingletonManager();
	~SingletonManager();

public:
	static SingletonManager* getSingletonManagerInstance();
	static void destroySingletonManagerInstance();
};



