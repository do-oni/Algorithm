const isValid = (s: string): boolean => {
  const parentheses = {
      '(': ')',
      '{': '}',
      '[': ']'
  };
  const stack = [];
  const keys = Object.keys(parentheses);

  for (let i = 0; i < s.length; i++) {
      if (keys.includes(s[i])) {
          stack.push(s[i]);
      } else {
          if (parentheses[stack[stack.length - 1]] === s[i]) {
              stack.pop();
          } else {
              return false;
          }
      }
  }
  return !stack.length;
}