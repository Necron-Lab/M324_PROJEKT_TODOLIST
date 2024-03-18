import { render, screen } from '@testing-library/react';
import App from './App';

test('renders ToDo Liste', () => {
  render(<App />);
  const linkElement = screen.getByText(/ToDo Liste/i);
  expect(linkElement).toBeInTheDocument();
  expect(linkElement).toBeVisible();
  expect(linkElement).toHaveClass("headline")
});

test('renders input field', () => {
  render(<App />);

  const inputField = screen.getByRole('textbox');
  inputField.value = "test";

  expect(inputField).toHaveValue("test");
  expect(inputField).toBeInTheDocument();
});
