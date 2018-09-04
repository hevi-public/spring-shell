package org.springframework.shell;

import java.util.List;

public interface ArgumentResolver {

    List<String> wordsForArguments(String command, List<String> words);
}
