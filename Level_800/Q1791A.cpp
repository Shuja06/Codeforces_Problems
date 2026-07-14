// Codeforces Checking

#include <iostream>

void solve() {
  char c;
  std::cin >> c;

  if (c == 'c' || c == 'o' || c == 'd' || c == 'e' || c == 'f' || c == 'r' ||
      c == 's') {
    std::cout << "YES\n";
    return;
  }
  std::cout << "NO\n";
}

int main() {
  int n;
  std::cin >> n;
  while (n--) {
    solve();
  }
  return 0;
}
