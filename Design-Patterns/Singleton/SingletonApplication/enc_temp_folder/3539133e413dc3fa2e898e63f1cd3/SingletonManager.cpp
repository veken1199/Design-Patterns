#include "stdafx.h"
#include "SingletonManager.h"

SingletonManager* SingletonManager::SingletonManagerInstance;

SingletonManager::SingletonManager()
{
}

SingletonManager::~SingletonManager()
{
}

SingletonManager* SingletonManager::getSingletonManagerInstance() 
{
	if(SingletonManager::SingletonManagerInstance == nullptr) 
	{
		std::cout << "Creating the singleton instance";
		SingletonManager::SingletonManagerInstance = new SingletonManager();
	}

	else 
	{
		std::cout << "There is already an instance in use";
	}

	return SingletonManager::SingletonManagerInstance;
}


void SingletonManager::destroySingletonManagerInstance()
{
	if (SingletonManager::SingletonManagerInstance == nullptr)
	{
		std::cout << "There is nothing to delete";
	}

	else delete SingletonManager::SingletonManagerInstance;
}
