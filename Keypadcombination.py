def findCombinations(combinations, digits, previous, index, lettersAndNumbersMapping):
    if index == len(digits):
        combinations.append(previous)
        return
    letters = lettersAndNumbersMapping[int(digits[index])]
    for i in range(0, len(letters)):
        findCombinations(combinations, digits, previous + letters[i], index + 1, lettersAndNumbersMapping)


def letterCombinations(digits):
    combinations = []
    if digits is None or len(digits) == 0:
        return combinations
    lettersAndNumbersMapping = [
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    ]
    findCombinations(combinations, digits, "", 0, lettersAndNumbersMapping)
    return combinations
s=input()
str=[]
for i in s:
    str.append(int(i))
l=letterCombinations(str)
a=[]
for i in l:
    a.append(i[::-1])
a.sort()

b=[]
for i in a:
    b.append(i[::-1])
for i in b:
    print(i)