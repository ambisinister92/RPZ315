#include "stdafx.h"
#include <iostream>
#include <string>
using namespace std;
void main()
{
	int groups, max = 0;
	int a;
	cout << "How many groups ?" << endl;
	cin >> groups;
	int mas[7] = { 0,0,0,0,0,0,0 };
	for (int i = 0; i < groups; i++)
	{
		for (int j = 0; j < 7; j++)
		{
			a = rand() % 2;
			cout << a;
			mas[j] += a;
		}
		cout << endl;
	}

	for (int i = 0; i < 7; i++)
	{
		if (mas[i] > max)
			max = mas[i];
	}
	cout << endl;
	cout << "Max = " << max << endl;
}