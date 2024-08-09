public class Q {
    String... pro(){}//compilation fail because var-args can't be used in the return type
}

// Q.java:2: error: <identifier> expected
//     String... pro(){}//compilation fail because var-args can't be used in the return type
//           ^
// Q.java:2: error: invalid method declaration; return type required
//     String... pro(){}//compilation fail because var-args can't be used in the return type
//               ^
// 2 errors
// error: compilation failed