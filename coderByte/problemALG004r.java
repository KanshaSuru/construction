/*
 *   Copyright (c) 2021 
 *   All rights reserved.
 */
package coderByte;


/*
 *   Copyright (c) 2021 
 *   All rights reserved.
 */

 // Java program to generate odd sized magic squares

class GFG {
	// Function to generate odd sized magic squares
	static void generateSquare(int n)
	{
		int[][] magicSquare = new int[n][n];

		// Initialize position for 1
		int i = n / 2;
		int j = n - 1;

		// One by one put all values in magic square
		for (int num = 1; num <= n * n;) {
			if (i == -1 && j == n) // 3rd condition
			{
				j = n - 2;
				i = 0;
			}
			else {
				// 1st condition helper if next number
				// goes to out of square's right side
				if (j == n)
					j = 0;

				// 1st condition helper if next number is
				// goes to out of square's upper side
				if (i < 0)
					i = n - 1;
			}

			// 2nd condition
			if (magicSquare[i][j] != 0) {
				j -= 2;
				i++;
				continue;
			}
			else
				// set number
				magicSquare[i][j] = num++;

			// 1st condition
			j++;
			i--;
		}

		// print magic square
		System.out.println("The Magic Square for " + n
						+ ":");
		System.out.println("Sum of each row or column "
						+ n * (n * n + 1) / 2 + ":");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(magicSquare[i][j] + " ");
			System.out.println();
		}
	}

	// driver program
	public static void main(String[] args)
	{
		// Works only when n is odd
		int n = 3;
		generateSquare(n);
	}
}

// Contributed by Pramod Kumar

/*
# Python program to generate
# odd sized magic squares
# A function to generate odd
# sized magic squares


def generateSquare(n):

	# 2-D array with all
	# slots set to 0
	magicSquare = [[0 for x in range(n)]
				for y in range(n)]

	# initialize position of 1
	i = n / 2
	j = n - 1

	# Fill the magic square
	# by placing values
	num = 1
	while num <= (n * n):
		if i == -1 and j == n: # 3rd condition
			j = n - 2
			i = 0
		else:

			# next number goes out of
			# right side of square
			if j == n:
				j = 0

			# next number goes
			# out of upper side
			if i < 0:
				i = n - 1

		if magicSquare[int(i)][int(j)]: # 2nd condition
			j = j - 2
			i = i + 1
			continue
		else:
			magicSquare[int(i)][int(j)] = num
			num = num + 1

		j = j + 1
		i = i - 1 # 1st condition

	# Printing magic square
	print("Magic Square for n =", n)
	print("Sum of each row or column",
		n * (n * n + 1) / 2, "\n")

	for i in range(0, n):
		for j in range(0, n):
			print('%2d ' % (magicSquare[i][j]),
				end='')

			# To display output
			# in matrix form
			if j == n - 1:
				print()

# Driver Code


# Works only when n is odd
n = 7
generateSquare(n)

# This code is contributed
# by Harshit Agrawal

*/

/*
<script>

// javascript program to generate odd sized magic squares
// Function to generate odd sized magic squares

function generateSquare(n)
{
	magicSquare = Array(n).fill(0).map(x => Array(n).fill(0));

	// Initialize position for 1
	var i = parseInt(n / 2);
	var j = n - 1;

	// One by one put all values in magic square
	for (num = 1; num <= n * n;) {
		if (i == -1 && j == n) // 3rd condition
		{
			j = n - 2;
			i = 0;
		}
		else {
			// 1st condition helper if next number
			// goes to out of square's right side
			if (j == n)
				j = 0;

			// 1st condition helper if next number is
			// goes to out of square's upper side
			if (i < 0)
				i = n - 1;
		}

		// 2nd condition
		if (magicSquare[i][j] != 0) {
			j -= 2;
			i++;
			continue;
		}
		else
			// set number
			magicSquare[i][j] = num++;

		// 1st condition
		j++;
		i--;
	}

	// print magic square
	document.write("The Magic Square for " + n
					+ ":<br>");
	document.write("Sum of each row or column "
					+ parseInt(n * (n * n + 1) / 2) + ":<br>");
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++)
			document.write(magicSquare[i][j] + " ");
		document.write("<br>");
	}
}

// driver program
// Works only when n is odd
var n = 7;
generateSquare(n);

// This code is contributed by 29AjayKumar

</script>

*/