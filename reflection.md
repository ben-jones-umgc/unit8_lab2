# Reflection – AI Number Program Lab

##  Student Name:
Benjamin Jones

##  GitHub Repository Link:
https://github.com/ben-jones-umgc?tab=repositories

## Iteration 1

What the AI code does:
- qwen3.8-flash-next-iq3_s

Tests passed/failed:
- All tests passed

What surprised you:
- It found the tests' expected outputs and ensured it would work first try

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- The prompt was more specific ("return the largest integer in an array"), but the code did not need to change. The Iteration 1 version already loops through the array and keeps the largest value it has seen.

What improved:
- The prompt now matches what the tests expect, so it is clear why the method is written this way. Starting the max at Integer.MIN_VALUE also handles the empty array and all-negative arrays without a special case.

What still failed and why:
- Nothing failed. All four tests (basic array, negative numbers, single value, empty array) still pass, because the Iteration 1 code was written to match the tests.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
- findResult returns the largest value in the array. If the array is empty (or null), it returns Integer.MIN_VALUE. Running main prints "Result: 9" for {3, 7, 2, 9, 4}.

What was fixed:
- The empty-array case is now handled by an explicit check at the top of the method instead of only working because max started at Integer.MIN_VALUE. The loop now starts from values[0], so it's clear the method is finding the largest real value in the array. All four tests still pass.

What you learned:
- Code can pass the tests and still not make its intent obvious. An explicit check for the edge case makes the expected behavior clear to anyone reading the code, not just to the tests.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
  - Because the AI read the test file in Iteration 1, its first answer already matched every test, including the empty-array case. The later prompts didn't change how the method behaved. They only made the code clearer, especially Iteration 3, which made the empty-array check explicit.
- How did testing affect your changes?
  - The tests defined what "correct" meant, such as returning Integer.MIN_VALUE for an empty array. That guided the first implementation, and the tests also confirmed that the Iteration 3 refactor didn't break anything.
- What did version control help you understand?
  - Committing each iteration separately keeps a record of how the code changed from the starter stub to the final version. Each change can be compared or undone. It also showed that Iteration 2 changed only the reflection, not the code.