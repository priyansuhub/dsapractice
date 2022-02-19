// Priyansu Rath
#include <bits/stdc++.h>
using namespace std;
#define gc getestCasehar_unlocked
#define ll long long
#define PI 3.1415926535897932384626
#define ll long long
#define si(x) scanf("%d", &x)
#define sl(x) scanf("%lld", &x)
#define ss(s) scanf("%s", s)
#define pi(x) printf("%d\n", x)
#define pl(x) printf("%lld\n", x)
#define ps(s) printf("%s\n", s)
#define br printf("\n")
#define fo(i, n) for (i = 0; i < n; i++)
#define Fo(i, k, n) for (i = k; k < n ? i < n : i > n; k < n ? i += 1 : i -= 1)
#define deb(x) cout << #x << " = " << x << endl;
#define deb2(x, y) cout << #x << " = " << x << ", " << #y << " = " << y << endl
#define deba(i, a, n)                                                          \
  fo(i, n) { cout << a[i] << " "; }
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()
#define clr(x) memset(x, 0, sizeof(x))
#define sortall(x) sort(all(x))
#define tr(it, x) for (auto it = x.begin(); it != x.end(); it++)
#define trr(it, x) for (auto it = x.rbegin(); it != x.rend(); it +)
typedef pair<int, int> pii;
typedef pair<ll, ll> pl;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<pii> vpii;
typedef vector<pl> vpl;
typedef vector<vi> vvi;
typedef vector<vl> vvl;

void priyansu() {
  int testCase = 0, testTemp = 1;
  cin >> testTemp;
  while (testCase++ < testTemp) {

    ll n, k;
    cin >> n;
    cin >> k;

    vector<ll> uwu(1, 1);
    k -= n;

    ll current= 2;

    for (int i = 2; i <= n; i++) {
      if (k < uwu.size()) {
        int val = uwu[uwu.size() - k - 1];
        uwu.push_back(val);
        break;
      }
      k -= uwu.size();
      uwu.push_back(current);
      current++;
    }

    while (uwu.size() < n) {
      uwu.push_back(uwu.back());
    }

    for (auto x : uwu ) {
      cout << x<< " ";
    }
    cout << endl;
  }
}

int main(void)
{
    priyansu();
}