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
		std::cout << "Creating the singleton instance" << "\n";
		SingletonManager::SingletonManagerInstance = new SingletonManager();
	}

	else 
	{
		std::cout << "There is already an instance in use" << "\n";
	}

	return SingletonManager::SingletonManagerInstance;
}


void SingletonManager::destroySingletonManagerInstance()
{
	if (SingletonManager::SingletonManagerInstance == nullptr)
	{
		std::cout << "There is nothing to delete" << "\n";
	}

	else delete &SingletonManager::SingletonManagerInstance;
}
