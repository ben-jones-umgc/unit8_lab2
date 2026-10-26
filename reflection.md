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
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?