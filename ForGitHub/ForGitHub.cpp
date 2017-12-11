// ForGitHub.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include <iostream>
#include <string>


using namespace std;


class A {
public:
	int arr[7];
	A() { ; }
};



void main()
{
	int n;
	cin >> n;
	A *schedule = new A[n];
	for (int i = 0; i < n; i++) {
		string temp;
		cin >> temp;
		for (int j = 0; j < 7; j++) {
			schedule[i].arr[j] = temp[j] - 48;
		}
	}
	int aud = 1;
	for (int i = 0; i < 7; i++) {
		int temp = 0;
		for (int j = 0; j < n; j++)
			if (schedule[j].arr[i] == 1)
				temp++;
		if (temp > aud) aud = temp;
	}

	cout << aud;

	system("pause");
}

