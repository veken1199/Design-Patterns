// SingletonApplication.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "SingletonManager.h"

int main()
{
	SingletonManager* singleManager = SingletonManager::getSingletonManagerInstance();
	SingletonManager* singleManager2 = SingletonManager::getSingletonManagerInstance();
	SingletonManager* singleManager3 = SingletonManager::getSingletonManagerInstance();

	SingletonManager::destroySingletonManagerInstance();
	SingletonManager::destroySingletonManagerInstance();

	int x; 
	std::cin >> x;
    return 0;
}

