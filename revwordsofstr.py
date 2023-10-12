def reverse_words(sentence):
    # Split the sentence into words
    words = sentence.split()

    # Reverse the order of words
    reversed_words = words[::-1]

    # Join the reversed words to form a new sentence
    reversed_sentence = " ".join(reversed_words)

    return reversed_sentence

# Example usage
input_sentence = "the sky is blue"
output_sentence = reverse_words(input_sentence)
print(output_sentence)
