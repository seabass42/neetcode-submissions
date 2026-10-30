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
            if (str.length() < prefix.length()) continue;

            if (str.substring(0, prefix.length()).contains(prefix)) return true;
        }
        return false;
    }
}
