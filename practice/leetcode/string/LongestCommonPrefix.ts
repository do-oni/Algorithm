// Runtime: 110ms, Memory Usage: 44.7mb
function longestCommonPrefix(strs: string[]): string {
  if (!strs.length) return "";

  let i = 0;
  while (true) {
    const char = strs[0][i] || "";
    const result = strs.every(str => str[i] === char);

    if (result) {
      i += 1;
    } else {
      break;
    }
  }
  return strs[0].slice(0, i);
}