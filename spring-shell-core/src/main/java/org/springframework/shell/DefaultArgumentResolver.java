package org.springframework.shell;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultArgumentResolver implements ArgumentResolver {

    /**
     * Returns the list of words to be considered for argument resolving. Drops the first N
     * words used for the command, as well as an optional empty word at the end of the list
     * (which may be present if user added spaces before submitting the buffer)
     */
    public List<String> wordsForArguments(String command, List<String> words) {
        int wordsUsedForCommandKey = command.split(" ").length;
        List<String> args = words.subList(wordsUsedForCommandKey, words.size());
        int last = args.size() - 1;
        if (last >= 0 && "".equals(args.get(last))) {
            args.remove(last);
        }
        return args;
    }
}
