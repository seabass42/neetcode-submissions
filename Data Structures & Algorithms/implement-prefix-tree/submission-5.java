class PrefixTree {
    Set<String> set;

    public PrefixTree() {
         set = new HashSet<>();
    }

    public void insert(String word) {
        set.add(word);
    }

    public boolean search(String word) {
        return set.contains(word);
    }

    public boolean startsWith(String prefix) {
        for (String str : set) {
            int i = 0;
            while (i < prefix.length() && i < str.length() && prefix.charAt(i) == str.charAt(i)) {
                i++;
            }
            if (i >= prefix.length()) return true;
        }
        return false;
    }
}
